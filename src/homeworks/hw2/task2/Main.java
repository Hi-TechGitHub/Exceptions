package homeworks.hw2.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = in.nextDouble();
        System.out.print("Введите y: ");
        double y = in.nextDouble();

        System.out.println(divider(x, y));
    }

    public static double divider(double x, double y) {
        if (x == 0 || y == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        return x / y;
    }
}

