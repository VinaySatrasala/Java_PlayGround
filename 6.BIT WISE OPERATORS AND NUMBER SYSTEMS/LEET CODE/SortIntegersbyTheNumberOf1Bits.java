import java.util.Arrays;

public class SortIntegersbyTheNumberOf1Bits {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 2, 3, 1 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (counter(arr[j]) > counter(arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                if (counter(arr[j + 1]) == counter(arr[j])) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static int counter(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }


    /*Excellent solution
     *         //ok so for this enginner rule is applied where each number is updated by a the number itself + number of bits in number*(10001) and then we will sort it and then we will take the modulo.
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]+=Integer.bitCount(arr[i])*10001;
        }
        
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i]%10001;
        }
        return arr;
    }
     */
}
