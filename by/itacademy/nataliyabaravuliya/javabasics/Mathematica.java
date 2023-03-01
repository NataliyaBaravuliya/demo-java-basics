package by.itacademy.nataliyabaravuliya.javabasics;

import java.util.Scanner;

public class Mathematica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите значение b: ");
        double b = scanner.nextDouble();
        System.out.print("Введите значение c: ");
        double c = scanner.nextDouble();
        double d = b * b - 4 * a * c;
          if (d > 0) {
              double x1 = (-b - Math.sqrt(d)) / (2 * a);
              double x2 = (-b + Math.sqrt(d)) / (2 * a);
              System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
          } else if (d == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else if (d < 0) {
            System.out.println("Уравнение не имеет действительнных корней");
        }
    }
}
