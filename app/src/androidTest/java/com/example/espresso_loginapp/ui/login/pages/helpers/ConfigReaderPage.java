package com.example.espresso_loginapp.ui.login.pages.helpers;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReaderPage {

    public String getPropertyFromConfigFile(String configItem) throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("test.properties");
        properties.load(inputStream);
        String configValue = properties.getProperty(configItem);
        return configValue;
    }
}
