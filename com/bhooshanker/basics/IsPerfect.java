package com.bhooshanker.basics;

public class IsPerfect {
    public static void main(String[] args) {
        /*
            Examples of Perfect Number

            1 + 2 + 3 -> 6
            1 + 2 + 4 + 7 + 14 -> 28

         */

        int n = 26;
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            System.out.println("It is a Perfect Number.");
        } else {
            System.out.println("It is not a Perfect Number.");
        }

    }
}
