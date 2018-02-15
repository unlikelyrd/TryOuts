package com.ramchaudhary;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	int a = 98;
//	int b = 0;
//        System.out.println(divideABYB(a, b));
//        System.out.println(divideAWEB(a, b));

        int a = getIntSquareRootAndDivide();
        System.out.println("The value of a is " + a);
        int b = getIntSquareRootAndDivide();
        System.out.println("The value of b is " + b);

        System.out.println(divideABYB(a, b));
        System.out.println("The result divide(a/b) is: " + divideABYB(a,b));

        double sqrt = Math.sqrt(divideABYB(a,b));

//        System.out.println(squareRoot(a,b));
        System.out.println("The result squareroot(a/b) is: " + sqrt);
    }

    public static int getIntSquareRootAndDivide() {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        try {
            return s.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }
    private static int divideABYB(int a, int b) {
        if(b !=0) {
            return a/b;
        }else {
            return 0;
        }
    }
    private static int divideAWEB(int a, int b) {
        try {
            return a/b;
        }catch(ArithmeticException e) {
            return 0;
        }
    }

    private static double squareRoot(int a, int b) {
        try {
            return Math.sqrt(squareRoot(a,b));
        }catch(ArithmeticException e) {
            return 0;
        }
    }
}
