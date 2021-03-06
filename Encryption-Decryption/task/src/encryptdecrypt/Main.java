package encryptdecrypt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static String mode = "enc";
    private static int key = 0;
    private static String data = "";
    private static String filePath;
    private static String alg = "shift";


    public static void main(String[] args) {
        extractArgs(args);
        data = transform();
        writeDataToFile(data, filePath);
    }


    private static void extractArgs(String[] args) {
        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-in":
                    data = readDataFromFile(args[i + 1]);
                    break;
                case "-mode":
                    mode = args[i + 1];
                    break;
                case "-key":
                    key = Integer.parseInt(args[i + 1]);
                    break;
                case "-out":
                    filePath = args[i + 1];
                    break;
                case "-alg":
                    alg = args[i + 1];
                default:
                    break;
            }
        }

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-data")) {
                data = args[i + 1];
            }
        }
    }


    private static void writeDataToFile(String data, String filePath) {
        if (filePath != null) {
            try {
                FileWriter writer = new FileWriter(filePath);
                writer.write(data);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(data);
    }


    private static String readDataFromFile(String arg) {
        try {
            Scanner scanner = new Scanner(new File(arg));
            data = scanner.nextLine();
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }


    private static String transform() {
        StringBuilder builder = new StringBuilder();
        if (alg.equals("unicode")) {
            switch (mode) {
                case "enc":
                    for (char c : data.toCharArray()) {
                        builder.append(c + key > 127 ? (char) (c + key - 128) : (char) (c + key));
                    }
                    return builder.toString();
                case "dec":
                    for (char c : data.toCharArray()) {
                        builder.append(c - key > 127 ? (char) (c - key + 128) : (char) (c - key));
                    }
                    return builder.toString();
                default:
                    return mode + " is not an operation!";
            }
        }

        switch (mode) {
            case "enc":
                for (char c : data.toCharArray()) {
                    if (c >= 65 && c <= 90) {
                        builder.append(c + key > 90 ? (char) (c + key - 26) : (char) (c + key));
                    } else if (c >= 97 && c <= 122) {
                        builder.append(c + key > 122 ? (char) (c + key - 26) : (char) (c + key));
                    } else {
                        builder.append(c);
                    }
                }
                return builder.toString();
            case "dec":
                for (char c : data.toCharArray()) {
                    if (c >= 65 && c <= 90) {
                        builder.append(c - key < 65 ? (char) (c - key + 26) : (char) (c - key));
                    } else if (c >= 97 && c <= 122) {
                        builder.append(c - key < 97 ? (char) (c - key + 26) : (char) (c - key));
                    } else {
                        builder.append(c);
                    }
                }
                return builder.toString();
            default:
                return mode + " is not an operation!";
        }
    }

}
