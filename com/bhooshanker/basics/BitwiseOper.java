package com.bhooshanker.basics;

public class BitwiseOper {
    public static void main(String[] args) {

        int a = 43;
        int b = 23;

        int c = a & b;

        int d = a | b;

        System.out.println(c);
        System.out.println(d);

        int i = 8;      // 1 0 0 0

        //  Left Shift Operator

        System.out.println("LEFT SHIFT OPERATOR");
        int j = i << 1; // 1 0 0 0 0    //  2x Doubles the Value
        int k = i << 2; // 1 0 0 0 0 0  // 4x the Value

        System.out.println(j);
        System.out.println(k);

        // Right Shift Operator

        System.out.println("RIGHT SHIFT OPERATOR");
        int l = i >> 1;     // 100      // 1/2 Halves the Value     // only applies when have zero bits
        int m = i >> 2;     // 10       // 1/4 the Value            // ""

        System.out.println(l);
        System.out.println(m);

        i = 25;             // 1 1 0 0 1
        int n = i >> 1;     //   1 1 0 0

        System.out.println(n);



    }
}
