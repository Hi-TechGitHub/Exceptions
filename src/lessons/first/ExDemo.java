package lessons.first;

public class ExDemo {
    public static void main(String[] args) {
        int[] num = {4, 8, 16, 32, 64, 128, 256, 512};
        int[] num2 = {2, 0, 4, 4, 0, 8};// 1,  2
        try {
            for (int i = 0; i < num.length; i++) {
                try {
                    System.out.println(num[i] + " / " + num2[i] + " = " + num[i] / num2[i]);
                } catch (ArithmeticException e) {
                    System.out.println("Попытка деления на 0: " + num[i] + " / " + num2[i] + " = -1");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Фатальная ошибка");
            System.out.println("Выход за границы массива");
        }
    }
}
