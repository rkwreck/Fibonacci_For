package com.example.spring_portfolio.minilabs;
import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.util.*;

abstract class Fibonacci {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci. How many numbers of the sequence would you like? ");
        String fib = input.nextLine();

        int fNum = Integer.parseInt(fib);
        int num2 = 1;
        int count = 0;
        int product = 1;       //add something unique

        for (int num1 = 0; count < fNum; count ++) {
            System.out.println(num1 + " ");
            int sum = num1 + num2;      //add the next number
            num1 = num2;        //swap
            num2 = sum;
            product *= num1;   //multiply the next number
        }
        System.out.print("It took " + count + " iterations of the for loop. ");
        System.out.println("The total sum of your sequence is " + num2 + ". ");
        System.out.print("When your sequence is multiplied together (0 exclusive), the product is " + product + ".");

    }
}
