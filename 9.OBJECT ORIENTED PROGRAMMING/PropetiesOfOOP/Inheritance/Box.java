public class Box {
    double l,b,h;
    public Box(){
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }

    public Box(double l,double b,double h){
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public Box(double side){
        this.l = side;
        this.b = side;
        this.h = side;
    }

    public Box(Box other) {
    }

    public void information(){
        System.out.println("Running Box class");
    }
}
