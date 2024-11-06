import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs={"eat","tea","tan","ate","nat","bat"};    
        // String[] strs={"","",""};
        // String[] strs={"cab","tin","pew","duh","may","ill","buy","bar","max","doc"};
        // String[] strs={"vin","pin","min","niv"};

        System.out.println(groupAnagrams(strs));;
    }
    static List<List<String>> groupAnagrams(String[] strs){
        List<String> str=new ArrayList<>(Arrays.asList(strs));
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<str.size();i++){
            ans.add(new ArrayList<>());
            ans.get(ans.size()-1).add(str.get(i));
            String tempi=String.valueOf(sorter(str.get(i)));
            int j=i+1;
            while(j<str.size())
            {
                String tempj=String.valueOf(sorter(str.get(j)));
                if(tempi.equals(tempj)){
                    ans.get(ans.size()-1).add(str.get(j));
                    str.remove(j);
                }else{
                    j++;
                }
            }
        }
        return ans;


    }
    static char[] sorter(String str){
        char[] temp=str.toCharArray();
        Arrays.sort(temp);

        return temp;
    }
}
