package secondweek;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Hello world!
 */
public class Assigment2 {

    public static Logger logger = LoggerFactory.getLogger(Assigment2.class);

    private String max;
    private String min;
    private String increment;

    private TableCreator tableCreator;

    public static void main(String[] args) {
        logger.info("Something changes");
        Assigment2 assigment2 = new Assigment2();
        assigment2.initProperties();
        if ("double".equals(System.getProperty("type"))) {
            assigment2.tableCreator = new DoubleTableCreator(assigment2.max, assigment2.min, assigment2.increment);
        } else {
            assigment2.tableCreator = new LongTableCreator(assigment2.max, assigment2.min, assigment2.increment);
        }
        assigment2.tableCreator.createTable();
        // something's changed
    }

    private void initProperties() {
        Properties properties = new Properties();
        try {
            InputStream inputStream = new FileInputStream(("src/main/resources/config.properties"));
            properties.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        max = properties.getProperty("max");
        min = properties.getProperty("min");
        increment = properties.getProperty("increment");
    }

}
