package lessons.first1;

//class Calculator {
//    public static void main(String[] args) {
//        try {
//            double result = calculate(5, '/', 0);
//            System.out.println(result);
//        } catch (ArithmeticException e) {
//            System.out.println("Арифметическая ошибка: " + e.getMessage());
//        } catch (IllegalArgumentException e) {
//            System.out.println("Недопустимый аргумент: " + e.getMessage());
//        }
//    }
//
//    public static double calculate(double num1, char operator, double num2) {
//        if (num2 == 0 && operator == '/') {
//            throw new ArithmeticException("Деление на ноль недопустимо");
//        }
//        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
//            throw new IllegalArgumentException("Недопустимая операция");
//        }
//        // остальной код
//    }
//}

class CalculatorException extends Exception {
    public CalculatorException(String message) {
        super(message);
    }
}

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
//            throw new CalculatorException("Деление на ноль недопустимо");
//        }
//        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
//            throw new CalculatorException("Недопустимая операция");
//        }
//        // остальной код
//    }
//}