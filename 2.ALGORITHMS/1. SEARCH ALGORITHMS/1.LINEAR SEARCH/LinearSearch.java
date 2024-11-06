public class LinearSearch{
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,6,7,676,7434,-1,-2,6};
        int target=6;

        //Linear Search1
        int ans=linearsearch1(array, target);
        System.out.println(ans);

        //Linear Search2
        boolean res=linearsearch2(array, target);
        System.out.println(res);
        
    }
    //Search the target element present or not 
    //If found return index
    //if not found return -1
    static int linearsearch1(int[] array,int target){
        if (array.length==0){
            return -1;
        }
        for(int index=0;index<array.length;index++){
            if (array[index]==target){
                return index;

            }
        }
        return 1;
    }
    
    //Linear Search 2 that returns true or false
    static boolean linearsearch2(int[] array,int target){
        if (array.length==0){
            return false;
        }
        for(int i:array){
            if (i==target){
                return true;
            }
        }
        return false;
    }
}