import java.io.*;
class FileOpenExample {
    public static void main(String[] args) {

        File file = new File("data.txt");

        if (file.exists()) {
            System.out.println("File opened successfully.");
        } else {
            System.out.println("File does not exist.");
        }
    }
}