package com.softbd.collection_framework;


import java.util.*;

public class ArrayList_test {

    public static void main(String... args) {

        ArrayList<String> arrL = new ArrayList<String>();
        ArrayList<Integer> arri = new ArrayList<Integer>();


        arrL.add("Protick");
        arrL.add("Reza");
        arrL.add("Shovon");
        arrL.add("Sami");
        arri.add(1);
        arri.add(2);
        arri.add(2);
        arri.add(4);
        arri.add(5);

        System.out.println(arrL.size());
        System.out.println(arrL);
      /*  Iterator<String> itr = arrL.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }*/

        for (String itr : arrL) {
            System.out.println(itr);
        }

        for (int itr : arri) {
            System.out.println(itr + 5);
        }


        arrL.set(1, "Hello");

        arrL.remove(2);
        arrL.removeIf(str -> str.contains("Sami"));  // Lambda Expression

        for (String itr : arrL) {
            System.out.println(itr);
        }

        Collections.sort(arrL);

           Iterator<String> itr = arrL.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }

}
