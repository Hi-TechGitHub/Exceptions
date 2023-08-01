package homeworks.hw2.task3;

import homeworks.hw2.task2.DivisionByZeroException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = in.nextDouble();
        System.out.print("Введите y: ");
        double y = in.nextDouble();
        System.out.print("Введите z: ");
        double z = in.nextDouble();


        if (x > 100) {
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        }
        if (y < 0) {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        }
        if (x + y < 10) {
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        }
        if (z == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        System.out.println("Проверка пройдена успешно");

    }
}
