public class Student {
    String name = "Rishitha";
    int age = 20;
    void display() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}