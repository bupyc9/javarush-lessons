package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String fileName = consoleReader.readLine();
            if (fileName.equals("exit")) {
                break;
            }

            ReadThread readThread = new ReadThread(fileName);
            readThread.start();
        }

        consoleReader.close();
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try {
                BufferedReader fileReader = new BufferedReader(new FileReader(fileName));

                HashMap<Integer, Integer> map = new HashMap<>();
                while (fileReader.ready()) {
                    int data = fileReader.read();

                    if (map.containsKey(data)) {
                        map.put(data, map.get(data) + 1);
                    } else {
                        map.put(data, 1);
                    }
                }

                fileReader.close();

                int max = 0;
                for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
                    if ((int) entry.getValue() > max) {
                        max = (int) entry.getValue();
                    }
                }

                for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
                    if(entry.getValue().equals(max)) {
                        resultMap.put(fileName, entry.getKey());
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
