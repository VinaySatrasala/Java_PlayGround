import java.util.Arrays;

public class InPlace {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        inPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(null, 0, 0, null);
    }
    static void inPlace(int[] arr,int s , int e){
        if(e-s == 1){
            return;
        }

        int m = (s+e)/2; 
        inPlace(arr, s, m);
        inPlace(arr, m, e);

        merge(arr, s, m, e);
        
    }
    static void merge(int[] arr , int s , int m,int e){
        int[] mix = new int[e - s];

        int i=s;
        int j=m;
        int k=0;

        while(i < m && j < e){
            if(arr[i] < arr[j]){
                mix[k++] = arr[i++];
            }else if(arr[i] > arr[j]){
                mix[k++] = arr[j++];
            }else{
                mix[k++] = arr[i++];
                mix[k++] = arr[j++];
            }
        }

        while(i<m){
            mix[k++] = arr[i++];
        }

        while(j < e){
            mix[k++] = arr[j++];
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }

    }
}
