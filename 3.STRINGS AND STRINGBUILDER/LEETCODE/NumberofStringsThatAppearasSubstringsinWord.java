public class NumberofStringsThatAppearasSubstringsinWord {
    public static void main(String[] args) {
        String s="abcabc";
        String[] patterns = {"a","abc","bc","d"}; 
        String word = "abc";
        // String[] patterns = {"a","b","c"}; 
        // String word = "aaaaabbbbb";
        System.out.println(numOfStrings(patterns, word));
    }
    static int numOfStrings(String[] patterns, String word) {
        int count=0;
        for (String str : patterns) {
            if(word.contains(str)){
                count++;
            }
            
        }
        return count;
    }
    
}
