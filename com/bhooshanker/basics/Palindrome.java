package com.bhooshanker.basics;

public class Palindrome {
    public static void main(String[] args) {

        int n = 121;

        int temp = n;
        int rev = 0;
        int rem;

        while(temp != 0) {
            rem = temp % 10;
            temp = temp / 10;
            rev = rev * 10 + rem;
        }
        if (n == rev) {
            System.out.println("It's a Palindrome Number.");
        } else {
            System.out.println("It is not a Palindrome Number.");
        }

    }
}
