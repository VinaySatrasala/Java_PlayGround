import java.util.List;

public class CountItemsMatchingaRule {
    public static void main(String[] args) {
        
    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ruleKey_index=rule(ruleKey);
        int count=0;
        for(List<String> i : items){
            if(i.get(ruleKey_index).equals(ruleValue)){
                count++;
            }
        }
        return count;

    }
    static int rule(String ruleKey){
        String[] rulekeys={"type", "color", "name"};
        if(ruleKey.equals("type")){
            return 0;
        }else if(ruleKey.equals("color")){
            return 1;
        }else{
            return 2;
        }
    }
    //if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue)) res++;
    // if(ruleKey.equals("color") && items.get(i).get(1).equals(ruleValue)) res++;
    // if(ruleKey.equals("name") && items.get(i).get(2).equals(ruleValue)) res++;//
}
