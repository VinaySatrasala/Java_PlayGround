public class StaticBlock {

    static int a = 10;
    static int b;
    static {
        System.out.println("hello");
        b = 5*a;
    }
    public static void main(String[] args) {
        // int[]
        System.out.println(b);
    }
}
