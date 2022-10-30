package secondweek;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

/**
 * Hello world!
 */
public class Assigment2 {
    //git

    static Logger logger = LoggerFactory.getLogger(Assigment2.class);

    private String max;
    private String min;
    private String increment;

    private TableCreator tableCreator;

    public static void main(String[] args) {
        Assigment2 assigment2 = new Assigment2();
        assigment2.initProperties(("src/main/resources/config.properties"));
        if ("double".equals(System.getProperty("type"))||"float".equals(System.getProperty("type"))) {
            assigment2.tableCreator = new DoubleTableCreator(Double.parseDouble(assigment2.max) ,
                    Double.parseDouble(assigment2.min), Double.parseDouble(assigment2.increment));
        } else {
            assigment2.tableCreator = new LongTableCreator(Long.parseLong(assigment2.max) ,
                    Long.parseLong(assigment2.min), Long.parseLong(assigment2.increment));
        }
        logger.info("The table :".concat("\n".concat(assigment2.tableCreator.createTable())));
    }

    public void initProperties(String path) {
        Properties properties = new Properties();
        try (InputStream inputStream = Files.newInputStream(Path.of(path))){
            properties.load(inputStream);
        } catch (IOException e) {
            throw new MyOwnException("config not exist",e);
        }
        max = properties.getProperty("max");
        min = properties.getProperty("min");
        increment = properties.getProperty("increment");
    }

}
