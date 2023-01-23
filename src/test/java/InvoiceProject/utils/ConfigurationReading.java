package InvoiceProject.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReading {

   private static Properties configfile=new Properties();

    static {
        try{
            FileInputStream fileInputStream=new FileInputStream("Configuration.properties");
            configfile.load(fileInputStream);
            fileInputStream.close();
        }catch (IOException e){
            e.getStackTrace();
            System.out.println("CONFIGURATION File Is not Loaded !!!!!!!!!");
        }
    }

    public static String getProperty(String key){return configfile.getProperty(key);
    }


}
