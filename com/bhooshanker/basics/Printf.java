package com.bhooshanker.basics;

public class Printf {
    public static void main(String[] args) {
        int i = 4, j = 2, k;
        k = i + j;

        System.out.println("The addition of " + i + " and " + j + " is " + k);

        System.out.printf("The addition of %d and %d is %d", i , j, k);
//                %.2f to control the decimal points to 2
//                %10.4f occupies 10 spaces for non-decimal part and limits decimal part to 4;



    }
}
