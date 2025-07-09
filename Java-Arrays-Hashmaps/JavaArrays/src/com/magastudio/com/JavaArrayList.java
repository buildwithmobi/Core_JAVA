package com.magastudio.com;
import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args) {
        int [] numArr =  {1,3,4};

        ArrayList<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("cat");
        animals.add("fox");
        animals.add("fish");
        animals.add("kitten");

        boolean containsKitten = false;
        for(String animal : animals){
            if(animal.toLowerCase().equals("kitten")){
                containsKitten = true;
                break;
            }
        }

        if(containsKitten){
            System.out.println("Yes, there is a kitten in your collection! :)");
        } else {
            System.out.println("No kitty :(");
        }

        for(String animal : animals){
            System.out.println("Animal: " + animal);
        }

        ArrayList random = new ArrayList();
        random.add("Cow");
        random.add(1,"Bull");
        random.add(33);
        System.out.println(random);
    }



}

