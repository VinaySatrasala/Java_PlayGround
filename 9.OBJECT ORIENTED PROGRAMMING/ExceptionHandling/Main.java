public class Main{
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            // int c = a/b;
            // Method 2
            divide(a,b);
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }   
    }

    // Method 2
    static int divide(int a,int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Don't try to divide by zero");
        }

        return a/b;
    }
}