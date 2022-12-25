package api.string;

import java.io.IOException;
import java.util.Arrays;

public class KeyboardToStringExample {
    public static void main (String[] args) throws IOException {

        byte[] bytes = new byte[100];

        System.out.print("입력 : ");
        int readByteNo = System.in.read(bytes);

        String str = new String(bytes, 0 , readByteNo-1);
        // carrage return, line feed  /r, /n
        System.out.println(str);


        System.out.println(str.charAt(3));
        System.out.println(str.equals("hello"));
        System.out.println(str.trim());
        System.out.println(str.toUpperCase());
    }
}
