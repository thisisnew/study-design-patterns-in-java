package facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {

    private Database() {
    }

    public static Properties getProperties(String dbName) {
        String fileName = dbName + ".txt";
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream(fileName));
        } catch (IOException e) {
            System.out.println("Warning: " + fileName + " is not found.");
        }

        return properties;
    }
}
