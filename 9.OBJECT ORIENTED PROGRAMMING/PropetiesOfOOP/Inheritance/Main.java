public class Main {
    public static void main(String[] args) {
        BoxWeight box1 =new BoxWeight();

        System.out.println(box1.h +" "+box1.weight);

        // This way possible beacuse when you create instance of child class since parent was extended
        // so instance of parent class is already implemented
        // This way possible object type :Parent instance : child (vise -versa )is not possible
        // using varibale K of child class   
        Box k =new BoxWeight(1,2,3,4);
        BoxWeight m =(BoxWeight) new Box(0, 0, 0);
        System.out.println(m.b);
        BoxWeight box2 = new BoxWeight(1,2,4,5);

    }
}
