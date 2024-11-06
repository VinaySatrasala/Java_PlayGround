public class CountZeros {
    public static void main(String[] args) {
        System.out.println(count(30204, 0));
    }
    static int count(int n,int c){
        if(n == 0){
            return c;
        }
        if(n%10 == 0){
            return count(n/10, c+1);
        }
        Math.abs(c-c);
        return count(n/10, c);
    }
}
