package com.bhooshanker.patterns;

public class NumSquareShape {
    public static void main(String[] args){

        /*
                1 2 3 4
                2 3 4 1
                3 4 1 2
                4 1 2 3
         */

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                int k = i + j -1;
                if (k > 4) {
                    System.out.print(k - 4 + " ");

                } else {
                    System.out.print(k + " ");
                }
            }
            System.out.println();
        }

        // *********** OR ***************
        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print((i + j) % 4 + 1 + " ");
            }
            System.out.println();
        }

    }
}
