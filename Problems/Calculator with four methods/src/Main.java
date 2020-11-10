// Don't delete this import statement

import java.util.Scanner;

class SimpleCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long num1 = scanner.nextLong();
        String operator = scanner.next();
        long num2 = scanner.nextLong();

    }

    // Implement your methods here
    public static void subtractTwoNumbers(long num1, long num2) {
        System.out.println(num1 - num2);
    }


    public static void sumTwoNumbers(long num1, long num2) {
        System.out.println(num1 + num2);
    }


    public static void divideTwoNumbers(long num1, long num2) {
        System.out.println(num2 != 0 ? num1 / num2 : "Division by 0!");
    }

    public static void multiplyTwoNumbers(long num1, long num2) {
        System.out.println(num1 * num2);
    }
}
