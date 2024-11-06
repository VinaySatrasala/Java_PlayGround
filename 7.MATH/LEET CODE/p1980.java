import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class p1980 {
    public String findDifferentBinaryString(String[] nums) {
        Set<Integer> set = new HashSet<>();
        for(String s : nums){
            set.add(Integer.parseInt(s));
        }
        char[] ch = new char[nums.length];
        Arrays.fill(ch, '0');


        
        return "";
    }
    private String find(Set<Integer> set , char[] ch,int index){
        if(index > ch.length){
            return null;
        }
        String s = new String(ch);
        if(set.contains(Integer.parseInt(s))){
            return s;
        }
        ch[index] = '1';
        String left = find(set, ch, index+1);
        String right = find(set, ch, index + 1);
        if(left != null){
            return left;
        }
        return right;

    }
}
