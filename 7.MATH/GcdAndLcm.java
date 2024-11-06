public class GcdAndLcm {
    public static void main(String[] args) {
        System.out.println("Gcd : "+gcd(335456, 65564565));
        System.out.println("Lcm : "+335456/gcd(335456, 65564565)*65564565);
    }
    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}
