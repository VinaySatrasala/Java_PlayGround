public class ConstructtheRectangle {
    public static void main(String[] args) {
        System.out.println(Div(37));
    }
    static int Div(int n){
        int root=(int)Math.sqrt(n);
        while(true){
            if(n%root == 0){
                return root;
            }
            root--;
        }
        // return 1;
    }
}
