package lessons.first;

public class LessonFirst {
    public static void main(String[] args) {
        int[] num = new int[4];
        try{
            System.out.println("До генерации исключения");
            num[7] = 10;
            System.out.println("После генерации исключения");
        }
        catch (ArrayIndexOutOfBoundsException exception ) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
            exception.toString();
            System.out.println("Выход за границы массива");
        }
        System.out.println("после операции catch");

    }
}
