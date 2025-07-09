package groupOfClasses;

import java.util.Arrays;

public class indexArray {

    public static void main(String[] args) {
        int [] numbers = new int[5];
        numbers[0]=55;
        numbers[2]=65;
        numbers[4]=75;

        String [] names = new String[3];
        names[0]="Mubashir";
        names[1]="Abid";
        names[2]="Mian";

        System.out.println(Arrays.toString(names));
        System.out.println(names.length);

        System.out.println("Exception in-case out of range!");

        System.out.println(numbers[3]);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length-1+" <= length subtract One is");
    }
}
