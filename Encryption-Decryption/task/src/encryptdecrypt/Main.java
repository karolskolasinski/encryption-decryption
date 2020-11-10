package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        char[] split = scanner.nextLine().toCharArray();
        int key = scanner.nextInt();

        switch (operation) {
            case "enc":
                enc(split, key);
                break;
            case "dec":
                dec(split, key);
                break;
            default:
                System.out.println(operation + " is not an operation!");
        }
    }

    private static void dec(char[] split, int key) {
        for (char c : split) {
            c = c - key > 127 ?
                    (char) (c - key + 128) :
                    (char) (c - key);

            System.out.print(c);
        }
    }

    private static void enc(char[] split, int key) {
        for (char c : split) {
            c = c + key > 127 ?
                    (char) (c + key - 128) :
                    (char) (c + key);

            System.out.print(c);
        }
    }
}
