import java.io.*;
public class FileCloseExample {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("data.txt");
        System.out.println("File opened.");
        fr.close();
        System.out.println("File closed.");
    }
}