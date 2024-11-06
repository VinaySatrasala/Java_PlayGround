public class Pat1{
    public static void main(String[] args) {
        f(4, 0);
    }

    static void f(int r,int c){
        if(r == 0){
            return;
        }

        if(c < r){
            f(r, ++c);
            System.out.print("*{"+r+c+"} ");
        }else{
            f(--r, 0);
            System.out.println();
        }
    }
}