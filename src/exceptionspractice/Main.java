package exceptionspractice;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {0,1,2};
        int a = 10;
        int b = 0;
        try {
            System.out.println(a/b);
        }
        catch(ArithmeticException e) {
            System.out.println("You cannot divide by zero");
            System.out.println(e);

        }

        try {
            System.out.println(numbers[5]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds");
            System.out.println(e);

        }
    }
}
