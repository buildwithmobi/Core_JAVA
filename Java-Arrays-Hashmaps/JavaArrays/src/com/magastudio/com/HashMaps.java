package com.magastudio.com;
import  java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static java.util.Map.*;

public class HashMaps {
    public static void main(String[] args) {
        // not good practose
        HashMap users = new HashMap<>();

        HashMap<String,Integer> newUser = new HashMap<>();
        newUser.put("Sue",34);
        users.put("Mian",90);
        users.put("Joe",404);
        users.put("Bush",554);
        users.put("Salman",69);


        if(users.containsValue("Joe")){
            System.out.println("Yes (: Joe is here");
        }
        else{
            System.out.println("Joe isn't here :)");
        }

        System.out.println("Fact :  Mian is here = > "+ users.containsKey("Mian"));

        System.out.println(users.values() + " => Keys ");
        System.out.println(users.keySet() + " => Values");

        System.out.println(users.entrySet());

        Iterator it =users.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey()+ " : "+ pair.getValue());
        }

    }
}
