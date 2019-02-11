package com.clc;
public class AppCalculator {

    public static void main(String[] args) {
        int x;
        int y;
        String operator;

        x = Integer.parseInt(args[0]);
        operator = args[1];
        y = Integer.parseInt(args[2]);

        Calculator calculator = new Calculator();

        if (operator.equals("+")) {
            System.out.println(calculator.add(x, y));
        }
        if (operator.equals("/")) {
            System.out.println(calculator.divide(x, y));
        }
        if (operator.equals("*")) {
            System.out.println(calculator.multiply(x, y));
        }
        if (operator.equals("-")) {
            System.out.println(calculator.subtract(x, y));
        }
   }
}
