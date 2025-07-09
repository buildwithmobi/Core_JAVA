package groupOfClasses;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name : ");
        String userName = scanner.nextLine();

        System.out.println("What is your Age?");
        int ageUser = scanner.nextInt();
        int year = LocalDate.now().minusYears(ageUser).getYear();

        System.out.println("User Name is as follow : "+ userName);
        System.out.println("User was born at year : " + year);

        int [] evenNumbers = new int[2];
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.println("Enter number for array["+i+"]");
            int  evenNumber = scanner.nextInt();
            evenNumbers[i] = evenNumber;
        }
        System.out.println(Arrays.toString(evenNumbers));
    }
}
