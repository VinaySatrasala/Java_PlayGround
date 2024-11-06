import java.util.Arrays;

public class Searchin2DArray {

    public static void main(String[] args) {
        int [][] array={
            {1,2,5},
            {4,5,6},
            {7,8,9}
        };
        int target=5;
        int[] ans=findindex(array,target);
        System.out.println(Arrays.toString(ans));

        //Maximum element in 2D array
        int max=maximum(array);
        System.out.println("Max :"+max);
    }

    //Finding element in 2D array using linear search
    static int[] findindex(int[][] array, int target) {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]==target){

                    return new int[]{i,j};
                }
            }

        } 
        return new int[] {-1,-1};
    }

    //Finding maximum element in 2D array
    static int maximum(int[][] array){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]>max){
                    max=array[i][j];
                }
            }
        }
        return max;
    }
}
