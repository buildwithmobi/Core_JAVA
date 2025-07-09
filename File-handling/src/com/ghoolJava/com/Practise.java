package com.ghoolJava.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Practise {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src\\com\\ghooljava\\com\\test.txt");
        try(FileInputStream fileInputStream= new FileInputStream(file)){
            int contentInFile ;
            while((contentInFile = fileInputStream.read())!= -1){
                System.out.print((char) contentInFile);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
