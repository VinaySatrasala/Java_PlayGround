import java.util.Arrays;

public class Setmismatch {
        public static void main(String[] args) {
        int[] array={1,3,5,2,4};
        int i=0;
        while(i<array.length){
            int correct_index=array[i]-1;
            if(array[i]==array[correct_index]){
                i++;
            }else{
                int temp=array[i];
                array[i]=array[correct_index];
                array[correct_index]=temp;
            }
        }
        int[] ans ={0,0};
        for(i=0;i<array.length;i++){
            if(array[i]!=i+1){
                ans[0]=array[i];
                ans[1]=i+1;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
