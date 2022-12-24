public class ReverseString{
    public static void main(String[] args) {
        
    }
    static void fun(char[] m,int s,int e){
        if(s>e){
            return;
        }
        char temp=m[s];
        m[s]=m[e];
        m[e]=temp;
        fun(m,s+1,e-1);
    }
}