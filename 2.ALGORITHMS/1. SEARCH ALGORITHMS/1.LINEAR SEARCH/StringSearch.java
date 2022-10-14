public class StringSearch {
    public static void main(String[] args) {
        String str="vinay";
        char target='v';
        boolean ans=stringsearch1(str, target);
        System.out.println(ans);
        
    }

    //Usinf normal For loop
    static boolean stringsearch1(String str,char target){
        if (str.length()==0){
            return false;
        }
        for(int index=0;index<str.length();index++){
            if(target==str.charAt(index)){
                return true;
            }
        }
        return false;

    }

    //Using for each loop
    static boolean stringsearch2(String str,char target){
        if (str.length()==0){
            return false;
        }
        for(char c:str.toCharArray()){
            if(c==target){
                return true;
            }
        }
        return false;

    }

}
