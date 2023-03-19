import java.util.ArrayList;
import java.util.List;

public class PowerfulIntegers {
    public static void main(String[] args) {
        System.out.println(powerfulIntegers(2, 1, 10));
    }
    static List<Integer> powerfulIntegers(int x, int y, int bound) {
        List<Integer> ans=new ArrayList<>();
        for (int i = 1; i<bound; i*=x) {
            for (int j = 1; i+j <= bound; j*=y){
                if(!ans.contains(i+j)){
                    ans.add(i+j);
                }
                if(y==1){
                    break;
                }
            }
            if(x==1){
                break;
            }
        }
        return ans;

    }
}
