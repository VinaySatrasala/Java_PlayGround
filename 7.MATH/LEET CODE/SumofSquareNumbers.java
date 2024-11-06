public class SumofSquareNumbers {
    public static void main(String[] args) {
        int c=5;
        int i=1;
        long a = 0;
        long b = (long)Math.sqrt(c);
        while(a<=b){
            if((a*a + b*b) == c){
                // return true;
            }
            else if((a*a + b*b)<c){
                a++;
            }else{
                b--;
            }
        } 
        System.out.println("Not found");
    }
}
