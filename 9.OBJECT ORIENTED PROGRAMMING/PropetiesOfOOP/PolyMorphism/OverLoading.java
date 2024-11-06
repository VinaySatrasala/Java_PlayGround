// This is also called as compile time poly morphism or static polymorphism

public class OverLoading{

    int add(int a , int b){
        return a+b;
    }

    double add(int a,double b){
        System.out.println("d");
        return (int) (a+b+1);
    }
    public static void main(String[] args) {
        OverLoading obj = new OverLoading();
        System.out.println(obj.add(1, 1.0));
    }
}