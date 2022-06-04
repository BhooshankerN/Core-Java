package com.bhooshanker.basics;

public class ArmstrongNum {
    public static void main(String[] args) {
        /*
                Examples of Armstrong Number

                153 -> 1^3 + 5^3 + 3^3
                370 -> 3^3 + 7^3 + 0^3
         */
//        int n = 153;
//        int n = 370;
        int n = 155;
        int temp = n;
        int rem, sum = 0;

        while (temp != 0) {
            rem = temp % 10;
            temp = temp / 10;
            sum = (int) (sum + Math.pow(rem, 3));
        }
        if (sum == n) {
            System.out.println("It is an Armstrong Number.");
        } else {
            System.out.println("It is not an Armstrong Number.");
        }

    }
}
