package utils;

import java.io.*;
import java.util.*;

import org.apache.jmeter.threads.JMeterContextService;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeTestResult {

    public void writeResults(String testName, HashMap<String, String> results,
                             HashMap<String, String> stepName) throws Exception {
    	
    	int threadNum = JMeterContextService.getContext().getThreadNum();
    	
    	Thread.sleep((threadNum+1)*1500);

        String filePath = System.getProperty("user.dir") + "\\OutputResults\\" + testName + "_AdminPortal.xlsx";
        File file = new File(filePath);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            file.createNewFile();
        }

        Workbook workbook;
        try (FileInputStream fis = new FileInputStream(file)) {
            workbook = file.length() > 0 ? WorkbookFactory.create(fis) : new XSSFWorkbook();
        }

        Sheet sheet = workbook.getSheet(testName);
        if (sheet == null) sheet = workbook.createSheet(testName);

        int numberOfSteps = stepName.size();

        // Header Row
        Row headerRow = sheet.getRow(0) != null ? sheet.getRow(0) : sheet.createRow(0);
        headerRow.createCell(0).setCellValue("");
        for (int i = 1; i <= numberOfSteps; i++)
            headerRow.createCell(i).setCellValue(testName + "_" + i);

        // Step Names Row
        Row stepRow = sheet.getRow(1) != null ? sheet.getRow(1) : sheet.createRow(1);
        stepRow.createCell(0).setCellValue("");
        for (int i = 1; i <= numberOfSteps; i++)
            stepRow.createCell(i).setCellValue(stepName.getOrDefault(testName + "_" + i, "null"));

        // Results Row
        List<String> outputResults = new ArrayList<>();
        outputResults.add("User_" + (threadNum + 1));
        for (int i = 1; i <= numberOfSteps; i++)
            outputResults.add(results.getOrDefault(testName + "_" + i, "0"));

        Row resultRow = sheet.createRow(sheet.getLastRowNum() + 1);
        for (int i = 0; i < outputResults.size(); i++) {
            Cell cell = resultRow.createCell(i);
            String val = outputResults.get(i);
            try {
                cell.setCellValue(Double.parseDouble(val));
            } catch (NumberFormatException e) {
                cell.setCellValue(val);
            }
        }

        try (FileOutputStream out = new FileOutputStream(file)) {
            workbook.write(out);
        }
        workbook.close();

        System.out.println("Excel results appended for " + testName + " at: " + filePath);
    }
}
