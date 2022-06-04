package com.bhooshanker.basics;

public class Fibonacci {
    public static void main(String[] args) {

        /*
                0 1 1 2 3 5 8 ....
         */

        int a = 1, b = 1;
        int k = 0;
        System.out.print(0 + " " + 1 + " " + 1 + " ");

        for (int i = 2; i <= 20; i++) {
            k = a + b;
            System.out.print(k + " ");
            a = b;
            b = k;
        }

        System.out.println();
        int res = Fibo(10);
        System.out.println(res);

    }
    static int Fibo(int n) {
        if (n <= 1){
            return n;
        }
        return Fibo(n - 2) + Fibo(n - 1);
    }
}
