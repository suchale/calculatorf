package com.flexon.exercise;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scr=new Scanner(System.in);
        int i = scr.nextInt();
        String o = scr.next();
        char op = o.charAt(0);
        int j = scr.nextInt();
        int result;
        switch (op) {
            case '+':
                result = Calc.add(i, j);
                break;
            case '-':
                result = Calc.subtract(i, j);
                break;
            case '*':
                result = Calc.multiply(i, j);
                break;
            case '/':
                result = Calc.divide(i, j);
                break;
            case '%':
                result = Calc.mod(i,j);
                break;
                default:
                    throw new IllegalArgumentException("Bad Operator");

        }

        System.out.println(result);



    }
}
