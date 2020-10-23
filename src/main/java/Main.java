import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("podaj cos na klawiaturze");
        String read= new Scanner(System.in).nextLine();

        System.out.println("wypluwam to co podaleś :" + read);
        System.out.println("zapisuje do pliku printWriterTest.txt");

        PrintWriter printWriter = new PrintWriter("./printWriterTest.txt");
        printWriter.println(read);
        printWriter.close();

        Scanner load = new Scanner(new File("./printWriterTest.txt"));
        String text = load.nextLine();

        System.out.println("odczyt z pliku printWriterTest :" + text);

    }

}