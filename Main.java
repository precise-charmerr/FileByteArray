package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {

    public static byte[] read_method(File file) throws IOException {
        FileInputStream fl = new FileInputStream(file);
        byte[] arr = new byte[(int) file.length()];
        fl.read(arr);
        fl.close();
        return arr;
    }
    public static void write_method(String file_name, String s) throws IOException {
        try {
            OutputStream out = new FileOutputStream(file_name);
            byte[] db = s.getBytes();
            out.write(db);
            out.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        // byte array to file
        String s = "Welcome to java!!", file_name = "input.txt";
        write_method(file_name, s);

        // file to bye array
        File path = new File("input.txt");
        byte[] array = read_method(path);
        System.out.println("File to bye array");
        for (int i = 0; i < array.length; i++) {
            System.out.print((char) array[i]);
        }
    }
}