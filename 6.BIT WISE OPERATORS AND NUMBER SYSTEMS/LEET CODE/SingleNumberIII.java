public class SingleNumberIII {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,2,5};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=ans^arr[i];
        }
        int rmsbit=ans&(-ans);
        int a=0;
        for (int i : arr) {
            if((i&rmsbit) !=0){
                a^=i;
            }
        }
    }
    
    // [1,2,1,3,2,5]
}
