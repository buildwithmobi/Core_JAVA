package com.ghoolJava.com;

import java.io.IOException;

public class ReadInputs {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[10];
        System.out.println("Enter some Data : ");
        System.in.read(data);
        System.out.print("Entered data is : ");
        // casting => from byte to char
        for (int i = 0; i < data.length; i++) {
            System.out.print((char) data[i]);
        }
    }
}
