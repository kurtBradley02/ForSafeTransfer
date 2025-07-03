package com.app.write;

import java.io.IOException;
import java.util.List;
import com.app.read.Template;
import com.app.util.Config;

public class Generate {

    public static void printFromTextTemplate(Config config) throws IOException {

        List<String[]> selectedRows = config.getExcelData(config.getExcelPath());
        String[] anchors = config.getAnchors();

        Template template = new Template(config.getTemplatePath());

        List<String> results = template.textTemplate(selectedRows, anchors);

        for (String result : results) {
            System.out.println(result);
            System.out.println("---");
        }
    }
    
    public static List<String> export(Config config) throws IOException {

        List<String[]> selectedRows = config.getExcelData(config.getExcelPath());
        String[] anchors = config.getAnchors();

        Template template = new Template(config.getTemplatePath());

        List<String> results = template.textTemplate(selectedRows, anchors);
        
        return results;
        
    }

    
    
}
