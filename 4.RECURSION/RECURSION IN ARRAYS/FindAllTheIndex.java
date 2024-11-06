import java.util.ArrayList;

public class FindAllTheIndex {
    public static void main(String[] args) {
        System.out.println(f(new int[]{1,2,4,3,4,4}, 4, 0 , new ArrayList<>()));
    }

    static ArrayList f(int[] arr , int target , int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }

        return f(arr, target, ++index,list);
    }
}
