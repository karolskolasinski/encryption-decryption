package encryptdecrypt;

public class Main {
    private static String mode = "enc";
    private static int key = 0;
    private static String data = "";


    public static void main(String[] args) {
        extractArgs(args);
        run();
    }


    private static void run() {
        switch (mode) {
            case "enc":
                enc(data.toCharArray(), key);
                break;
            case "dec":
                dec(data.toCharArray(), key);
                break;
            default:
                System.out.println(mode + " is not an operation!");
        }
    }


    private static void extractArgs(String[] args) {
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-mode":
                    mode = args[i + 1];
                    break;
                case "-key":
                    key = Integer.parseInt(args[i + 1]);
                    break;
                case "-data":
                    data = args[i + 1];
                    break;
                default:
                    break;
            }
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
