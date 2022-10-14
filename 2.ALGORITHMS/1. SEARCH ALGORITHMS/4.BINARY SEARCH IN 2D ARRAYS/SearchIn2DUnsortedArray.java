import java.util.Arrays;

public class SearchIn2DUnsortedArray {
    public static void main(String[] args) {
        int[][] array={
            {18,9,12},
            {36,-4,91},
            {44,33,16}
        };
        int target=91;
        System.out.println(Arrays.toString(search(array, target)));
    }
    static int[] search(int[][] array,int target){
        for(int i=0;i<=array.length-1;i++){
            for(int j=0;j<=array[i].length-1;j++){
                if(array[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
