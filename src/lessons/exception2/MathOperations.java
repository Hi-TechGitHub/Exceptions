package lessons.exception2;
//
//class DivisionByZeroException extends Exception {
//    public DivisionByZeroException(String message) {
//        super(message);
//    }
//}
//
//class InvalidOperatorException extends Exception {
//    public InvalidOperatorException(String message) {
//        super(message);
//    }
//}
//
//class Calculator {
//    public static void main(String[] args) {
//        try {
//            double result = calculate(5, '/', 0);
//            System.out.println(result);
//        } catch (DivisionByZeroException e) {
//            System.out.println("Ошибка: Деление на ноль недопустимо");
//        } catch (InvalidOperatorException e) {
//            System.out.println("Ошибка: Недопустимая операция");
//        }
//    }
//
//    public static double calculate(double num1, char operator, double num2) throws DivisionByZeroException, InvalidOperatorException {
//        if (num2 == 0 && operator == '/') {
//            throw new DivisionByZeroException("Деление на ноль недопустимо");
//        }
//        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
//            throw new InvalidOperatorException("Недопустимая операция");
//        }
//        // остальной код
//    }
//}
//class CalculatorException extends Exception {
//    public CalculatorException(String message) {
//        super(message);
//    }
//}
//
//class DivisionByZeroException extends CalculatorException {
//    public DivisionByZeroException(String message) {
//        super(message);
//    }
//}
//
//class InvalidOperatorException extends CalculatorException {
//    public InvalidOperatorException(String message) {
//        super(message);
//    }
//}
//
//class Calculator {
//    public static void main(String[] args) {
//        try {
//            double result = calculate(5, '/', 0);
//            System.out.println(result);
//        } catch (CalculatorException e) {
//            System.out.println("Ошибка калькулятора: " + e.getMessage());
//        }
//    }
//
//    public static double calculate(double num1, char operator, double num2) throws CalculatorException {
//        if (num2 == 0 && operator == '/') {
//            throw new DivisionByZeroException("Деление на ноль недопустимо");
//        }
//        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
//            throw new InvalidOperatorException("Недопустимая операция");
//        }
//        // остальной код
//    }
//}




//try (Scanner scanner = new Scanner(new File("file.txt"))) {
//        // ваш код здесь
//        } catch (FileNotFoundException e) {
//        // обработка исключения
//        }

//import java.io.File; import java.io.FileReader; import java.io.IOException;
//public class MainApp { public static void main(String args[]) { try (FileReader reader = new FileReader(new
//        File("file.txt"))) {
//// Полезная работа, связанная с чтением
//    файла..
//} catch (IOException e) {
//    e.printStackTrace();
//}
//}
//}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



/**
 * Класс, представляющий пример для документации в Java.
 * Этот класс демонстрирует основные операции с числами.
 */
public class MathOperations {

    /**
     * Метод, который выполняет сложение двух чисел.
     *
     * @param a Первое число для сложения.
     * @param b Второе число для сложения.
     * @return Результат сложения a и b.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Метод, который выполняет вычитание двух чисел.
     *
     * @param a Уменьшаемое число.
     * @param b Вычитаемое число.
     * @return Результат вычитания b из a.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Метод, который выполняет умножение двух чисел.
     *
     * @param a Первый множитель.
     * @param b Второй множитель.
     * @return Результат умножения a на b.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Метод, который выполняет деление двух чисел.
     *
     * @param a Делимое число.
     * @param b Делитель.
     * @return Результат деления a на b.
     * @throws ArithmeticException Если делитель b равен нулю.
     */
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо.");
        }
        return a / b;
    }

    
}