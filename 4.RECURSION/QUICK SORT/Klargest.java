public class Klargest {
    public static void main(String[] args) {
        int[] arr={3,1,2,4};
        System.out.println(sort(arr, 0, arr.length - 1, 2));
        System.out.println(sort(arr, 0, arr.length - 1, 2));

        for(int i=1;i<=4;i++){
            // System.out.print(i+" ");            
        }
    }
    static int sort(int[] arr , int low ,int high,int k){
        if(low > high){
            return -1;
        }

        int s=low;
        int e=high;
        int m = s + (e - s)/2;
        int pivot = arr[m];

        while(s <= e){
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }

            if(s <= e){
                int temp = arr[s];
                arr[s++] = arr[e];
                arr[e--] = temp;
            }
        }

        if(e == arr.length - 1 -k){
            return pivot;
        }
        if(e > arr.length -1 - k){
            return sort(arr, low, e,k); 
        }
        return sort(arr, s, high,k);
    }
}
