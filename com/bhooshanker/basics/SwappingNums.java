package com.bhooshanker.basics;

public class SwappingNums {
    public static void main(String[] args) {

        int n1 = 4;
        int n2 = 5;

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.printf("a : %d; b : %d", n1, n2);
        System.out.println();
        // Second Method without temp variable

        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

        System.out.printf("n1 : %d; n2 : %d", n1, n2);
        System.out.println();

        // Third Method with XOR ^

        n1 = n1 ^ n2;
        n2 = n1 ^ n2;
        n1 = n1 ^ n2;

        System.out.printf("n1 : %d; n2 : %d", n1, n2);
        System.out.println();

        // Fourth Method with Mul & Div
            // applicable only when numbers are not zero

        n1 = n1 * n2;
        n2 = n1 / n2;
        n1 = n1 / n2;

        System.out.printf("n1 : %d; n2 : %d", n1, n2);
        System.out.println();

        // Fifth Method (One Line)

        n1 = 5; n2 = 10;

        n2 = n1 + n2 - (n1 = n2);

        System.out.printf("n1 : %d; n2 : %d", n1, n2);

    }
}
