package by.itacademy.nataliyabaravuliya.javabasics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите первое число");
        int num1 = scanner.nextInt();
        // System.out.println("¬ведите знак опперации");
        // char operation = getChar();
        System.out.println("¬ведите второе число");
        int num2 = scanner.nextInt();
        int result = num1 + num2;
        System.out.println("–езультат " + result);

    }
}
