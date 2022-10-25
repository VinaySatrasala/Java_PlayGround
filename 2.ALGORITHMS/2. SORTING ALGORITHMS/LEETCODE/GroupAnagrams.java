import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        // String[] strs={"eat","tea","tan","ate","nat","bat"};
        String[] strs={"a"};

        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            char[] temp=strs[i].toCharArray();
            Arrays.sort(temp);
            strs[i]=new String(temp);
        }
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        int i=1;
        int count=0;
        ans.add(new ArrayList<>());
        String current=strs[0];
        ans.get(count).add(current);
        while(i<strs.length){
            if(current.equals(strs[i])){
                ans.get(count).add(current);
            }else{
                count++;
                current=strs[i];
                ans.add(new ArrayList<>());
                ans.get(count).add(current);

            }
            i++;
        }

        System.out.println(ans);


    }
}
