package Grid;

import java.util.Arrays;

public class TabulationGid {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        for(int i = 0;i<4;i++){
            for(int j = 0;j<4;j++){
                if(i == 0){
                    arr[i][j] = 1;
                }else if(j == 0){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = arr[i-1][j] + arr[i][j - 1];
                }
            }
        }
        arr[0][0] = -1;
        for(int[] i : arr){
            System.out.println(Arrays.toString(i));
        }

    }
}

