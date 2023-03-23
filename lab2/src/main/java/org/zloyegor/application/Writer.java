package org.zloyegor.application;

import java.io.*;

public class Writer {
    private static BufferedReader reader;
    private static FileWriter fileWriter;

    public static void open(String path){
        try {
            ByteArrayInputStream in = new ByteArrayInputStream("y".getBytes());
            System.setIn(in);
            reader = new BufferedReader(new InputStreamReader(System.in));
            fileWriter = new FileWriter(path);
        } catch (IOException e) {
            System.out.println("IO file error");
        }
    }
    public static void write(double x, double res, String functionName){
        try {
//            System.out.println("Print value for module " + module.toString() + "? [y/n]");
//            String ans = reader.readLine();
//            if (ans == null) return;
//            while (!ans.equals("y") && !ans.equals("n")){
//                System.out.println("Wrong answer");
//                ans = reader.readLine();
//            }
//            if (ans.equals("y")){
                fileWriter.write(x + "," + res + "," + functionName + "\n");
                fileWriter.flush();
//            }

        } catch (IOException e){
            System.out.println("IO error");
        }
    }

    public static void close(){
        try{
            reader.close();
            fileWriter.close();
        } catch (IOException e){
            System.out.println("Unable to close streams");
        }
    }
}