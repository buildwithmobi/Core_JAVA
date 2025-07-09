package groupOfClasses;

import java.util.Scanner;

public class userMethod {
    public static void main(String[] args) {
        char [] letters = {'a','b','b','b','a','c','d','d'};
        char searchLetter = 'a';
        String count = countOccurrences(letters,searchLetter);
        System.out.println(count);

        String alphabets = inputAlphabets();
        System.out.println(alphabets);

    }
    public static String countOccurrences(char [] letters, char searchLetter){
        int count = 0;
        for (char chara : letters){
            if(chara==searchLetter){
               count++;
            }
        }
        return "THE COUNT OF LETTER a is " + count;
    }

    public static String inputAlphabets(){
        Scanner alphabets = new Scanner(System.in);
        System.out.println("Enter any Five Alphabet");
        for (int i = 0; i <5 ; i++) {
            System.out.println(i > 0 ? "Enter Alphabets" : "");
            String letters = alphabets.nextLine();
        }

        return null;
    }
}
