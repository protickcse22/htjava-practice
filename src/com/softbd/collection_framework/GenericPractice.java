package com.softbd.collection_framework;


import java.util.Iterator;

class Mygen<T> {
    T obj;

    void add(T obj) {
        this.obj = obj;
    }

    T get() {
        return this.obj;
    }
}

public class GenericPractice {

    public static <E> void printelements(E[] elements) {
        for (E element : elements) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String... args) {

        Mygen<Integer> obj = new Mygen<Integer>();

        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);


        System.out.println(obj.get());

    }
}

