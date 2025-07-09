package groupOfClasses;

import java.util.Scanner;

public class methods {
    public static void main(String[] args){
        String brand = "Samsung";
        brand.toLowerCase();

        System.out.println(brand.startsWith("S"));
        System.out.println(brand.startsWith("s"));
        System.out.println(brand.endsWith("g"));

        Scanner company = new Scanner(System.in);

        System.out.println("Enter Company Name : ");
        String companyName = company.nextLine();

        System.out.println(companyName.startsWith("A"));
        System.out.println();



    }

}
