package com.magastudio.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class HashMapsA {
    public static void main(String[] args) {
        HashMap<Integer, String> newUsers = new HashMap<>();
        HashMap<String, Integer> users = new HashMap<>();
        newUsers.put(77, "Joe");

        Iterator it = users.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(pair.getKey() + " : " + pair.getValue());

        }


    }}
