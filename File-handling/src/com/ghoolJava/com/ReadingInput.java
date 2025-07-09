package com.ghoolJava.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingInput {
    public static void main(String[] args) throws IOException {
        File file = new File ("src\\com\\ghoolJava\\com\\test.txt");
        try(FileInputStream fileInputStream = new FileInputStream(file)){
            System.out.println("Total size to read in bytes is "+ fileInputStream.available());

            int content;
            while ((content = fileInputStream.read())!=-1){
                System.out.print((char) content);
            }
    }catch (IOException e){
            //System.out.print(e.getMessage());
        }
}}
