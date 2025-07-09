package groupOfClasses;

import java.util.Arrays;

public class loops {
    public static void main(String[] args) {

        //Basic Concept
        int increment =0;
        increment = increment + 1;

        int decrement =0;
        decrement --;
        System.out.println(decrement);
        System.out.println();

        //General loop - access to Index
        int [] values = {1,2,3,4,5};

        for (int i = 0; i<values.length;i++){
            System.out.println(values[i]+"=> index is "+ i);
        }
        System.out.println();
        String [] capitals = {"Moscow","Berlin","Prague"};

        for (int i = 0; i < capitals.length; i++) {
            System.out.println("The capital of a country =>> "+ capitals[i]);
        }
        System.out.println();

        for (int i = capitals.length - 1; i >= 0; i--) {
            System.out.println(capitals[i]+ " Index in Reverse-Order " + i);
        }
        //Enhanced loop


        System.out.println();
        int [] evenNumbers= {2,4,6,8,10};

        for(int numbers : evenNumbers){
            System.out.println(numbers);
        }
        System.out.println();

        for (String cap : capitals){
            System.out.println(cap);
        }
        System.out.println();

        Arrays.stream(evenNumbers).forEach(System.out::println);
        Arrays.stream(capitals).forEach(System.out::println);
    }
}
