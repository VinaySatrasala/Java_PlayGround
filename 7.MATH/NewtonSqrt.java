public class NewtonSqrt{
    public static void main(String[] args) {
        double n=100;
        double x=n; 
        double root;
        while(true){
            root=0.5*(x+(n/x));
            if(Math.abs(root-x) < 0.00001){
                break;
            }
            x=root;
        }   

        System.out.println(root);

    }
}