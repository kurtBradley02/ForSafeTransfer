package com.app.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import com.app.read.Excel;

public class Config {

    private Properties props;

    public Config(String configPath) throws IOException {
        props = new Properties();
        try (FileInputStream fis = new FileInputStream(configPath)) {
            props.load(fis);
        }
    }

    public String getExcelPath() {
        return props.getProperty("excel.path");
    }

    public String getTemplatePath() {
        return props.getProperty("template.path");
    }

    public int getSheetIndex() {
        return Integer.parseInt(props.getProperty("sheet.index"));
    }

    public int[] getColumnIndexes() {
        String raw = props.getProperty("column.index");
        if (raw == null || raw.isEmpty()) return new int[0];
        String[] split = raw.split(",");
        int[] indexes = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            indexes[i] = Integer.parseInt(split[i].trim());
        }
        return indexes;
    }

    public String[] getAnchors() {
        String raw = props.getProperty("anchor");
        if (raw == null || raw.isEmpty()) return new String[0];
        return raw.split("\\s*,\\s*");
    }

    public List<String[]> getExcelData(String excelPath) throws IOException {
        int sheetIndex = getSheetIndex();
        int[] columnIndexes = getColumnIndexes();
        Excel excel = new Excel(excelPath);
        List<String[]> rows = excel.getAllValuesInColumns(sheetIndex, columnIndexes);
        excel.close();
        return rows;
    }
}
