import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("podaj cos na klawiaturze");
        Scanner scanner = new Scanner(System.in);
        String read= new Scanner(System.in).nextLine();

        System.out.println("wypluwam to co podaleś :" + read);
        System.out.println("zapisuje do pliku printWriterTest.txt");

        //method 1
        PrintWriter printWriter = new PrintWriter("./printWriterTest.txt");
        printWriter.println(read);
        printWriter.close();

        //method 2 - file , overwrittenfile
        FileWriter file = new FileWriter("./printWriterTest2.txt",true);
        file.write(read);
        file.close();

    }
}