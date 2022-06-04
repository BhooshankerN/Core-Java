package com.bhooshanker.basics;

public class ASCIIcode {
    public static void main(String[] args)
    {

        // ASCII (American Standard Code for Informantion Interchange)
        // 7 bits
        // 2^7 = 128 -> 0 to 127

        for (int i = 0; i < 128; i++)
        {
            System.out.printf("%d : %c\n", i, i);


        }

    }
}
