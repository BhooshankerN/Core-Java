package com.bhooshanker.basics;

public class SwitchCases {
    public static void main(String[] args) {

        int i = 6;

        switch(i)
        {
            default:
                System.out.println("Enter correct No");
//                break;        // if there is any case got true, it will not get executed even without
                // break statement; or else default and next case gets executed cuz there's no break
                // in default case!
                // It means it checks every case first and comes to default !
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 0:
                System.out.println("zero");
                break;
//            default:
//                System.out.println("Enter correct No");

        }

        String s = "hello";

        switch(s)
        {
            case "hi":
                System.out.println("hi");
                break;
            case "hello":
                System.out.println("hello");
                break;
            default:
                System.out.println("Not a greeting");
        }

    }
}
