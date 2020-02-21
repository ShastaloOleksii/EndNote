package com.myendnoteweb.utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ResourcesReader{
    protected String host;
    protected FileInputStream fis;
    protected Properties property = new Properties();
    protected String login;
    protected String password;
    protected String chromeDriver;

    public ResourcesReader() {
        try {
            fis = new FileInputStream("src/test/resources/properties/properties.properties");
        } catch (
                FileNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
            property.load(fis);
        } catch (
                IOException ex) {
            ex.printStackTrace();
        }

        {
            host = property.getProperty("host");
            chromeDriver = property.getProperty("chrome.driver");
            login = property.getProperty("login");
            password = property.getProperty("password");
        }
    }
}
