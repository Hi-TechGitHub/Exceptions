package lessons.two;


public class SimpleThrowExample {
    public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 0);
            System.out.println("Результат деления: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Произошла ошибка деления на ноль: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static int divideNumbers(int dividend, int divisor) {
        if (divisor == 0) {
            // return -1;
            throw new ArithmeticException("Деление на ноль недопустимо!");
        }
        return dividend / divisor;
    }
}

