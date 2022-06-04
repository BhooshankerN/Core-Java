package com.bhooshanker.basics;

public class TernaryOper {
    public static void main(String[] args) {

        int i = 1;
        int j = 4;

        if (i == 1)
        {
            j = 7;
        }
        else
        {
            j = 8;
        }

        j = i == 1 ? 7 : 8;

        System.out.println(j);

        // TERNARY OPERATORS WITH OBJECTS
        System.out.println("Ternary Operator with Objects");

        Object obj1;

        if (true)
        {
            obj1 = new Integer(10);
        }
        else
        {
            obj1 = new Double(15);
        }
        System.out.println(obj1);

        Object obj2;

        obj2 = true ? new Integer(10) : new Double(15);     // It checks the whole expression
                // and takes the output type with large capacity
        System.out.println(obj2);

    }
}
