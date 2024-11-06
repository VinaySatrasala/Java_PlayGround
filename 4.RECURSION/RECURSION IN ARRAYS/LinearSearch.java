public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(f(new int[]{1,2,4,3}, 1, 0));
    }

    static int f(int[] arr , int target , int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }

        return f(arr, target, ++index);
    }
}
