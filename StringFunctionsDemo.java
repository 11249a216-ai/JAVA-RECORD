public class StringFunctionsDemo {
    public static void main(String[] args) {

        String str1 = "Java Programming";
        String str2 = "java programming";
        String str3 = " Welcome to Java ";

        System.out.println("Original String: " + str1);

        // length()
        System.out.println("Length: " + str1.length());

        // charAt()
        System.out.println("Character at index 5: " + str1.charAt(5));

        // substring()
        System.out.println("Substring(5): " + str1.substring(5));
        System.out.println("Substring(5,11): " + str1.substring(5, 11));

        // concat()
        System.out.println("Concatenation: " + str1.concat(" Language"));

        // equals()
        System.out.println("Equals: " + str1.equals(str2));

        // equalsIgnoreCase()
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str2));

        // compareTo()
        System.out.println("CompareTo: " + str1.compareTo(str2));

        // compareToIgnoreCase()
        System.out.println("CompareTo Ignore Case: " + str1.compareToIgnoreCase(str2));

        // contains()
        System.out.println("Contains 'Java': " + str1.contains("Java"));

        // startsWith()
        System.out.println("Starts With 'Java': " + str1.startsWith("Java"));

        // endsWith()
        System.out.println("Ends With 'ming': " + str1.endsWith("ming"));

        // indexOf()
        System.out.println("Index of 'P': " + str1.indexOf('P'));

        // lastIndexOf()
        System.out.println("Last Index of 'a': " + str1.lastIndexOf('a'));

        // replace()
        System.out.println("Replace Java with Python: " + str1.replace("Java", "Python"));

        // replaceAll()
        System.out.println("ReplaceAll vowels: " + str1.replaceAll("[AEIOUaeiou]", "*"));

        // toUpperCase()
        System.out.println("Upper Case: " + str1.toUpperCase());

        // toLowerCase()
        System.out.println("Lower Case: " + str1.toLowerCase());

        // trim()
        System.out.println("Trim: '" + str3.trim() + "'");

        // isEmpty()
        String str4 = "";
        System.out.println("Is Empty: " + str4.isEmpty());

        // split()
        String[] words = str1.split(" ");
        System.out.println("Split:");
        for (String word : words) {
            System.out.println(word);
        }

        // valueOf()
        int num = 100;
        String s = String.valueOf(num);
        System.out.println("ValueOf(): " + s);

        // toCharArray()
        char[] ch = str1.toCharArray();
        System.out.println("Character Array:");
        for (char c : ch) {
            System.out.print(c + " ");
        }
        System.out.println();

        // join()
        String joined = String.join("-", "Java", "Python", "C++");
        System.out.println("Join: " + joined);

        // repeat() - Java 8 compatible
        System.out.print("Repeat: ");
        for (int i = 0; i < 3; i++) {
            System.out.print("Hi ");
        }
        System.out.println();
    }
}