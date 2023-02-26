import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class CountSpecialIntegers {
    public static void main(String[] args) {
        int count=0;
        // for (int i = 1; i <=5 ; i++) {
        //     if(DistinctFinder(i)){
        //         count++;
        //     }
        // }
        System.out.println(DistinctFinder(12));
        System.out.println(count);
    }
    static boolean DistinctFinder(int n){
 
        List<Character> chrs = (n+"").chars().mapToObj(e -> (char)e).collect(Collectors.toList());
        Set<Character> charSet = new HashSet<>(chrs);

        return chrs.size()== charSet.size();




        // ArrayList<Integer> digits=new ArrayList<>();
        // digits.add(n%10);
        // n/=10;
        // // System.out.println(digits.contains((Integer)2));
        // while(n>0){
        //     int lastDigit=n%10;
        //     if(!digits.contains((Integer)lastDigit)){
        //         digits.add(lastDigit);
        //     }else{
        //         return false;
        //     }
        //     n/=10;
        // }
        

    }    
}
