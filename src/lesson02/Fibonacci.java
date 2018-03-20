package lesson02;

public class Fibonacci {
    public static void main(String[] args) {

        printFibonacciNumbers(6);

    }

    static void printFibonacciNumbers(int numbers) {
        int firstNumber = 0;
        int nextNumber = 1;
        for (int i = 1; i <= numbers; i++) {
            System.out.println(firstNumber);
            firstNumber = firstNumber + nextNumber;
            nextNumber = firstNumber - nextNumber;
        }

    }
}
