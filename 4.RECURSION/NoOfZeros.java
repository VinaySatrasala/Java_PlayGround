public class NoOfZeros {
    public static void main(String[] args) {
        System.out.println(zero(30204, 0));
    }
    static int zero(int n,int count){
        if(n == 0){
            return count;
        }
        if(n %10 == 0){
            return zero(n/10,++count);
        }  
        return zero(n/10,count);
    }
}
