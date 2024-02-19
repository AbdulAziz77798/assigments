package com.collectionsDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Set<String> citySet = new HashSet<>();
        List<String> cityList = new ArrayList<>();

        cityList.add("Chennai");
        cityList.add("Mumbai");
        cityList.add("Banglore");
        cityList.add("Hyderabad");
        cityList.add("Delhi");

        System.out.println("List of Cities");
        for(String city : cityList){
            System.out.println(city);

        }
        System.out.println("\n");

        citySet.add("Chennai");
        citySet.add("Mumbai");
        citySet.add("Delhi");
        citySet.add("Banglore");
        citySet.add("Delhi");
        citySet.add("Hyderabad");

        System.out.println("Set of Cities");
        for(String city : citySet)
            System.out.println(city);


    }

}
