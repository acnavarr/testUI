package com.company.certification.test.util.properties;

import com.company.certification.test.exceptions.TestException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

    private static Properties prop = null;

    private TestProperties() {
        throw new IllegalStateException();

    }

    public static String getUrlFront() {
        loadProperties();
        return prop.getProperty("UrlFront");

    }

    public static void loadProperties() {
        if (prop == null) {
            prop = new Properties();
            File objclasspathRoot = new File(System.getProperty("user.dir"));
            String strFilePath = objclasspathRoot.getAbsolutePath();

            try {
                prop.load(new FileReader(strFilePath + "/prueba.properties"));
            } catch (IOException e) {
                throw new TestException(e);
            }
        }
    }



}
