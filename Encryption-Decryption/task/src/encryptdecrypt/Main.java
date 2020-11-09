package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] split = scanner.nextLine().toCharArray();
        int key = scanner.nextInt();

        for (char c : split) {
            if (c >= 97 && c <= 122) {
                c = c + key > 122 ?
                        (char) (c + key - 26) :
                        (char) (c + key);
            }

            System.out.print(c);
        }

    }
}
