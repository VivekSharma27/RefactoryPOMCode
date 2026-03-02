package utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
    private static Properties prop = new Properties();

    static {
        try {
            String path = System.getProperty("user.dir") + "\\config.properties";
            prop.load(new FileReader(new File(path)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getConfigProperty(String key) {
        return prop.getProperty(key);
    }
}
