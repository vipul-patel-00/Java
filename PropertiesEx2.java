package practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx2 {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        FileOutputStream os = new FileOutputStream("abc.properties");
        p.setProperty("url", "localhost:3306/myDb");
        p.setProperty("username", "vipul");
        p.setProperty("password", "vpatel");
        p.store(os, null);

    }
}
