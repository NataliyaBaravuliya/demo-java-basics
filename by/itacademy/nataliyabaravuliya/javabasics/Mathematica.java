package by.itacademy.nataliyabaravuliya.javabasics;

import java.util.Scanner;

public class Mathematica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� �������� a: ");
        double a = scanner.nextDouble();
        System.out.print("������� �������� b: ");
        double b = scanner.nextDouble();
        System.out.print("������� �������� c: ");
        double c = scanner.nextDouble();
        double d = b * b - 4 * a * c;
          if (d > 0) {
              double x1 = (-b - Math.sqrt(d)) / (2 * a);
              double x2 = (-b + Math.sqrt(d)) / (2 * a);
              System.out.println("����� ���������: x1 = " + x1 + ", x2 = " + x2);
          } else if (d == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("��������� ����� ������������ ������: x = " + x);
        } else if (d < 0) {
            System.out.println("��������� �� ����� ��������������� ������");
        }
    }
}
