package com.company;

public class Main {

    public static void main(String[] args) {
        int result = SumAndMultiply(8, 3);                                          //задание 4
        System.out.println("(8 + 3) + (8 * 3) = " + result);
    }

    public static int SumAndMultiply(int numberOne, int numberTwo) {                                // метод для задание 4
        int sum;
        sum = numberOne + numberTwo;
        int result;
        result = sum + (numberOne * numberTwo);
        return result;
    }
}
