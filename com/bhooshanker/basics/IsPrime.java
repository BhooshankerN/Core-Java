package com.bhooshanker.basics;

public class IsPrime {
    public static void main(String[] args) {

        int n = 30;
        boolean isPrime = false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n == 2){
                isPrime = true;
            }
            if (n % i == 0) {
                break;
            } else {
                isPrime = true;
            }
        }
        if (isPrime) {
            System.out.println("It is a Prime Number.");
        } else {
            System.out.println("It is not a Prime Number.");
        }

    }
}
