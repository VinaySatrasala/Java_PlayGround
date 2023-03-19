import java.util.List;
import java.util.stream.Collectors;

public class RotatedDigits {
    public static void main(String[] args) {
        int n=857;
        int count=0;
        for (int i = 1; i <= n; i++) {
            String str=i+"";
            if(!str.contains("3") && !str.contains("4") && !str.contains("7")){
                count++;
            }
        }
        System.out.println(count);
    }
    static int rotater(int n){
        if(n==0 || n==1 ||n==8){
            return n;
        }
        if(n ==2 || n==5){
            return 10/n;
        }
        if(n == 6 || n==9){
            return 54/n;
        }
        return -1;
    } 
}
