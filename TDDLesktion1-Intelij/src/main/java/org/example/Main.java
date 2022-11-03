package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    protected static int min(int number1, int number2, int number3) {
       return number1 <= number2 && number1 <= number3 ? number1 : number2 <= number3 ? number2 : number3;
    }
}