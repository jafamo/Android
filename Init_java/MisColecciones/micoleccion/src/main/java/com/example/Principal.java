package com.example;

import java.util.Set;

public class Principal {

    public static void main(String args[]){
        Set<String> conjunto = new HashSet<String>();

        conjunto.add("manzana");
        conjunto.add("pera");
        conjunto.add("fresa");
        conjunto.add("naranja");
        conjunto.remove("pera");
        for(String s : conjunto) {
            System.out.println(s);
        }

    }
}
