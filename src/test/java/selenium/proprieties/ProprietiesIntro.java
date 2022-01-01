package selenium.proprieties;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ProprietiesIntro {
    @Test
    public void testProprieties() throws IOException {
        File propertiesFile = new File("src/test/resources/configurations.properties"); //locates properties file
        Properties properties = new Properties();
        properties.load(new FileInputStream(propertiesFile)); //load all the values from properties file

        String url = properties.getProperty("url");
        System.out.println(url);
        // getProperty method return you String
        String username = properties.getProperty("username");
        System.out.println(username);
    }

    @Test
    public void testProperties1() throws IOException {
        File credsFile = new File("src/test/resources/credential.properties"); //locates properties file
        Properties properties = new Properties(); //you read from property file using property class--> question interview
        properties.load(new FileInputStream(credsFile)); //load all the values from properties file
        //checks if the value is password if not is going to the default value witch is chrome
        String password = properties.getProperty("browser", "chrome");
        System.out.println(password);
        // getProperty method return you String
        String username = properties.getProperty("username");
        System.out.println(username);

        String env = properties.getProperty("enviroment");
        System.out.println(env);
    }

}
