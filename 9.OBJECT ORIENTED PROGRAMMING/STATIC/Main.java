public class Main{
    public static void main(String[] args) {
        // Human vinay = new Human(1, "Vinay");

        // Human s = new Human(1, "s");


        System.out.println(Human.popu+=1);
        // System.out.println(Human.greet())
        // Human.greet();
        Main obj = new Main();
        obj.greet();
        System.out.println(obj);
        // greet();
    }
    void greet(){
        System.out.println("Hello");
        name();
    }
    void name(){
        System.out.println("Hello");
        // greet();
    }
    public String toString(){
        return "Hello";

    }
}


class Human{
    int num;
    String name;
    static long popu;
    public Human(int num,String name){
        this.num = num;
        this.name = name;
        Human.popu+=1;
    }
    static void greet(){
        System.out.println("hello");
    }
}