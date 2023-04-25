package characterstream3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB1 {
    public static void main(String[] args) {
        try {
            FileWriter output = new FileWriter("data.txt");
            output.write("Hello world");
            output.write("Welcome JAVA");
            output.close();
        } catch (IOException e) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, e);
        }


        try {
            FileReader input = new FileReader("data.txt");
            int ch;
            input.read();
            while((ch=input.read()) != -1){
                System.out.println((char) ch);
            }
        } catch (FileNotFoundException e) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, e);
        }

    }
}
