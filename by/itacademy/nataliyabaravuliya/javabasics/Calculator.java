package by.itacademy.nataliyabaravuliya.javabasics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ �����");
        int num1 = scanner.nextInt();
        // System.out.println("������� ���� ���������");
        // char operation = getChar();
        System.out.println("������� ������ �����");
        int num2 = scanner.nextInt();
        int result = num1 + num2;
        System.out.println("��������� " + result);

    }
}
