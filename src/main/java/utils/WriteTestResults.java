package utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.EncryptedDocumentException;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class WriteTestResults {

    public void writeResults(String testName,int numberOfSteps,  HashMap<String, String> results,
                             HashMap<String, String> stepName) throws InterruptedException, IOException, EncryptedDocumentException {

        String filePath = System.getProperty("user.dir") + "\\OutputResults\\" + testName + ".xlsx";
        File file = new File(filePath);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            file.createNewFile();
        }

        Workbook workbook;
        if (file.exists() && file.length() > 0) {
            workbook = WorkbookFactory.create(new FileInputStream(file));
        } else {
            workbook = new XSSFWorkbook();
        }
        
//        int numberOfSteps=stepName.size();

        Sheet sheet = workbook.getSheet(testName);
        if (sheet == null) sheet = workbook.createSheet(testName);

        // Write headers
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("");
        for (int i = 0; i <= numberOfSteps; i++) {
            headerRow.createCell(i + 1).setCellValue(testName + "_" + i);
        }

        // Write step names
        Row stepRow = sheet.createRow(1);
        stepRow.createCell(0).setCellValue("");
        for (int i = 0; i <= numberOfSteps; i++) {
            stepRow.createCell(i + 1).setCellValue(stepName.getOrDefault(testName + "_" + i, "null"));
        }

        // Write results
        Row resultRow = sheet.createRow(2);
        resultRow.createCell(0).setCellValue("User" + (Thread.currentThread().getId()));
        for (int i = 0; i <= numberOfSteps; i++) {
            resultRow.createCell(i + 1).setCellValue(results.getOrDefault(testName + "_" + i, "0"));
        }

        try (FileOutputStream out = new FileOutputStream(file)) {
            workbook.write(out);
        }
        workbook.close();
        System.out.println("Excel results written for " + testName +"at file path: " + filePath);
    }
}
