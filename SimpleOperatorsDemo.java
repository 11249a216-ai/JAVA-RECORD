public class SimpleOperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b = 3;
        System.out.println("a+b =" + (a+b));
        System.out.println("a-b=" + (a-b));
        System.out.println("a>b ?" + (a>b));
        boolean x = true, y= false;
        System.out.println("x && y =" + (x && y));
        a+=5;
        System.out.println("a after += 5:" + a);
        int max = (a>b) ? a:b;
        System.out.println("Maximum = " + max);
    }
}