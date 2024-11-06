import java.util.Arrays;

public class SearchInRowandColumnSorted {
    public static void main(String[] args) {
        int[][] array={
            {10,20,30,40},
            {15,25,35,45},
            {25,29,37,49},
            {33,34,38,50}};  
            int target=32;
            System.out.println(Arrays.toString(bs(array, target)));  
    }
    static int[] bs(int[][] array,int target){
        int row=0;
        int col=array.length-1;
        while(col>=0){
            int element=array[row][col];
            if(element==target){
                return new int[]{row,col};
            }else if(element>target){
                col--;
            }else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }

}
