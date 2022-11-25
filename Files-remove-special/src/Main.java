import java.io.BufferedReader;
import java.io.FileReader;
import java.net.*;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String name = scan.next();
        System.out.println("Enter the special word: ");
        String special = scan.next();
        try {
            //Read the file in a buffer
            String line;
            FileReader file = new FileReader(name);
            BufferedReader br0 = new BufferedReader(file);
            PrintWriter pw = new PrintWriter("output.txt");
            //Iterate over buffer lines, line by line
            while ((line = br0.readLine()) != null) {
                //Splits words by spaces
                line.split(" ");
                System.out.println(line);
                if (line.contains(special)) {
                    //Delete alle from the line.
                    System.out.println(line);
                    line.replace(special, "");
                }
                pw.println(line);

            }
            br0.close();

        }catch (Exception ex){
            System.out.println(ex);
        }
    }
}