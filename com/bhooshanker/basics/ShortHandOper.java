package com.bhooshanker.basics;

public class ShortHandOper {
    public static void main(String[] args) {

        int i, j, k;
        i = 4;
        j = 2;

        i += j;     // similarly -=, *=, /=, and %=
        System.out.println(i);

        byte b = 4;

//        b = b * 2.5;       // this gives an error cuz type taking is wrt., whole expression

        b *= 2.5;       // type taking is wrt. b in this case
        System.out.println(b);

    }
}
