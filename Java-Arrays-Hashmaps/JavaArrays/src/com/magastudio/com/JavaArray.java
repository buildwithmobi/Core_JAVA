package com.magastudio.com;

public class JavaArray {
    public static void main(String[] args) {
        int [] arrInts = {2,4,5,8};
        System.out.println(arrInts[3]);
        try{

            System.out.println(arrInts[5]);
        }
        catch (Exception  e){
            System.out.println(e.getMessage()+" " +e);
        }
        finally {
            for (int i=0;i< arrInts.length;i++){
                System.out.println(arrInts[i]);}
                System.out.println("The length of array is : " +arrInts.length);

        }

    }
}
