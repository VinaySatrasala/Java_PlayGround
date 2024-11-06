import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams2 {
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
            isthere(ans, str.get(i));
        }
        return ans;


    }
    static nu isthere(List<List<String>> str,String target){
        if(str.size()==0){
            str.add(new ArrayList<>());
            str.get(0).add(target);
            return null;
        }else{
            for(int i=0;i<str.size();i++){
                System.out.println(String.valueOf(sorter(str.get(i).get(0))));
                System.out.println(String.valueOf(sorter(target)));
                if(String.valueOf(sorter(str.get(i).get(0))).equals(String.valueOf(sorter(target)))){
                    str.get(i).add(target);
                    break;
                }else{
                    str.add(new ArrayList<>());
                    str.get(str.size()-1).add(target);
                    break;
                }
            }
        }

    }
    static char[] sorter(String str){
        char[] temp=str.toCharArray();
        Arrays.sort(temp);
        return temp;
    }
}
