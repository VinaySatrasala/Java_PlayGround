public class A{
    // Private
    // Private varible or methods can be accessed in the declared file or class.
    // Access for private stuff can be used using getter and setters
    private int num;

    

    public A() {
        System.out.println("Object created");
    }


    // Getter genarlly return the value that means get the value
    public int getNum() {
        return num;
    }


    // Setter genarally sets the value
    public void setNum(int num) {
        this.num = num;
    }



    // Public
    // Can be accesed any where like inside and outside the file
    public int num1;


    public A(int num1) {
        this.num1 = num1;
    }


    // Deafult access modifier
    // In the same package it will be allowed
    // if in the different package cannot be allowed
    int num2 = 10;
    String name;
    

    public A(int num2, String name) {
        this.num2 = num2;
        this.name = name;
    }



    // Protected
    protected int num3 = 10;

    

    

    

}