package com.bhooshanker.basics;

public class LabelledBreakStatement {
    public static void main(String[] args)
    {

        shanker:
        for (int i = 1; i < 5; i++)
        {
            for (int j = 1; j < 5; j++)
            {
                if (i == 3)
                {
//                    break shanker;    // try labelled break statement and
                    break;              // unlabelled break statement and check with the diffs!
                }

                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
