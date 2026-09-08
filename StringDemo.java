public class StringDemo {
    public static void main(String[] args) {
        String str = "Java Programming";

        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Substring: " + str.substring(5, 16));
        System.out.println("Contains 'Java': " + str.contains("Java"));
    }
}