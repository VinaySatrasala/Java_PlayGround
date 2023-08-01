public class SDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                isSafe(i, j);
            }
        }
    }
    static void isSafe(int row , int col) {
        // Stride
        int strideRow = (row/3)*3;
        int StrideCol = (col/3)*3;


        System.out.println(strideRow+" "+StrideCol);



        // return true;
    }
}
