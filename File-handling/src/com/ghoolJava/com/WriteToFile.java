package com.ghoolJava.com;

import java.io.*;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\com\\ghoolJava\\com\\WriteToFile");
        try(FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write("This is amazing ... ");
            fileWriter.close();
            String content = null;
            FileReader fileReader =new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((content= bufferedReader.readLine())!=null){
                System.out.println(content);

            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
