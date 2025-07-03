package com.app;

import java.io.IOException;
import java.util.List;

import com.app.util.Config;
import com.app.write.Generate;

public class App {

    public static void main(String[] args) throws IOException {

        Config config;
        try {
            config = new Config("src/main/resources/config.txt");
        } catch (Exception e) {
            config = new Config("config.txt");
        }

        List<String> results = Generate.export(config);
        
        for(String result : results) {
        	System.out.println(result);
        }
        
    }
}