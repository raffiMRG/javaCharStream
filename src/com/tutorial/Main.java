package com.tutorial;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // membuka file

        // byte stream -> FileInputStream
        // char stram  -> FileReader

        FileInputStream byteFileinput = new FileInputStream("input.txt");
        FileReader charFileinput = new FileReader("input.txt");

        FileOutputStream byteFileOutput = new FileOutputStream("outputByte.txt");
        FileWriter charFileOutput = new FileWriter("outputChar.txt");

        // membaca file

        // byte file
        int buffer = byteFileinput.read();
        while (buffer != -1){
            System.out.print((char)buffer);
            byteFileOutput.write(buffer);
            buffer = byteFileinput.read();
        }
        System.out.println("\n");

        // char file
        buffer = charFileinput.read();
        while (buffer != -1){
            System.out.print((char)buffer);
            charFileOutput.write(buffer);
            buffer = charFileinput.read();
        }

        // Menutup file
        byteFileinput.close();
        byteFileOutput.close();
        charFileinput.close();
        charFileOutput.close();
    }

}
