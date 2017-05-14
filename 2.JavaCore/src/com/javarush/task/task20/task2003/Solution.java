package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        reader.close();
        load(inputStream);
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties properties = new Properties();
        for (Map.Entry pair : Solution.properties.entrySet()){
            properties.setProperty(pair.getKey().toString(), pair.getValue().toString());
        }
        properties.store(outputStream, "test");
        outputStream.close();
    }

    public void load(InputStream inputStream) throws Exception {
        Properties properties = new Properties();
        properties.load(inputStream);
        Solution.properties.clear();
        for (Map.Entry e : properties.entrySet()){
            Solution.properties.put(e.getKey().toString(), e.getValue().toString());
        }
        inputStream.close();
    }

    public static void main(String[] args) {

    }
}
