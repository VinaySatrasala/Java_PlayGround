public class SearchInRange {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,78,89,9};
        int start_range=2;
        int end_range=5;
        int target=4;
        boolean ans=searchinrange(array, start_range, end_range, target);
        System.out.println(ans);
        
    }
    static boolean searchinrange(int[] array,int start_range,int end_range,int target){
        if (array.length==0){
            return false;
        }
        for(int i=start_range;i<end_range;i++){
            if (array[i]==target){
                return true;
            }
        }
        return false;
    }
}
