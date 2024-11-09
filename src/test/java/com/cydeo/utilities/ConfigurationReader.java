package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {



    //1- make a new properties object
    // make it private from to be limited access to the object, static to make sure it is created and loaded before

    private static Properties properties = new Properties();

    static {

        try {
            //2- open  file using FileInputStream

            FileInputStream file = new FileInputStream("configuration.properties");

            //3- Load  the "properties" object with  file
            properties.load(file);

            //close the file in the memory
            file.close();

        } catch (IOException e) {
            System.out.println("File not found with given path!!!");
            e.printStackTrace();
        }

    }
    // create a utility method to use the object to raed
    //4- use "properties" object to read from the file
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }

}

