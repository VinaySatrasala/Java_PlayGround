public class ApplyBitwiseOperationstoMakeStringsEqual {
    public static void main(String[] args) {
        String s="";
        String target="";
        int st=Integer.parseInt(s,2);
        int targett=Integer.parseInt(target, 2);
        if(finder(st) == finder(targett)){
            
        }
    }
    static int finder(int n){
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}
