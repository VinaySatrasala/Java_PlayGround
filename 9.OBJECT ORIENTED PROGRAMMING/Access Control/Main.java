public class Main {
    public static void main(String[] args) {
        A obj = new A();
        obj.setNum(100);
        
        // Private
        System.out.println(obj.getNum());

        // Public
        System.out.println(obj.num1);

        // Default
        System.out.println(obj.num2);


        // Protected
        System.out.println(obj.num3);
    }
}
