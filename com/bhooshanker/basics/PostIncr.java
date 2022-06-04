package com.bhooshanker.basics;

public class PostIncr {
    public static void main(String[] args) {

        int i = 3;

        int j = i++;

        System.out.println(j);
        System.out.println(i);

        i = i++;    // value will be same cuz

//        int fetch = i;
//        i++;
//        i = fetch
            // same as i = i++; it fetches initial value and returns it after when it gets incremented
        System.out.println(i);
    }
}
