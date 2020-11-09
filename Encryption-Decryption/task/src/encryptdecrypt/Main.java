package encryptdecrypt;

public class Main {
    public static void main(String[] args) {
        String message = "we found a treasure!";
        char[] split = message.toCharArray();

        for (char c : split) {
            if (c >= 97 && c <= 122) {
                c = (char) (c + 25 - 2 * (c - 97));
            }
            System.out.print(c);
        }


    }
}
