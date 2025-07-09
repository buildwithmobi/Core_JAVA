package Dsa;

import java.sql.SQLOutput;

public class bubleSort {
    public static void main(String[] args) {
        int []num= {4,6,8,1,2,99,77};

        int step =0;
        int changesInEachStep =0;

        System.out.print("Before sorting ");

        System.out.println();

        for (int numInArray:num){
            System.out.print(numInArray + " ");
        }

        int tempVal=0;

        for (int i = 0; i < num.length; i++) {

            step++;
            changesInEachStep=0;

            for (int j = 0; j < num.length-i-1; j++) {
                if(num[j]>num[j+1]){
                    changesInEachStep++;
                    tempVal =num[j];
                    num[j] = num[j+1];
                    num[j+1]= tempVal;
                }

            }
            System.out.println();

            for (int numInArray:num){
                System.out.print(numInArray + " ");
            }

            System.out.print(" Step is : " + step);
            System.out.print(" Changes made in iteration : "+ changesInEachStep);
        }

        System.out.println();
        System.out.println("After sorting ");

        for (int numInArray:num){
            System.out.print(numInArray + " ");
        }
    }
}
