package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Scanner sc = new Scanner(System.in);

        System.out.println("Input First Number:");
        String firstNumber = sc.nextLine();

        System.out.println("Input one of the following valid operators: +, -, *, / :");
        String operator = sc.nextLine();

        System.out.println("Input Second Number:");
        String secondNumber = sc.nextLine();

        int intFirst = Integer.parseInt(firstNumber);
        int intSecond = Integer.parseInt(secondNumber);
        int intResult = 0;

        if (operator.equals("+")) {
            intResult=(intFirst + intSecond);
        } else if(operator.equals("-")){
            intResult=(intFirst - intSecond);
        } else if(operator.equals("*")) {
            intResult = (intFirst * intSecond);
        } else if(operator.equals("/")){
            intResult=(intFirst) / (intSecond);

        }
        System.out.println("This is your result: " + intResult);
    }
         }
