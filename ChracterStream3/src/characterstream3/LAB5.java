package characterstream3;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB5 {
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(in);
        System.out.print("Enter text: ");
        try {
            System.out.print("Enter name: ");
            String name = input.readLine();
            System.out.println(name);
            System.out.print("Enter age: ");
            String age = input.readLine();
            System.out.println(age);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}