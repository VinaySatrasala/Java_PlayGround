import java.util.Arrays;

public class MaximizeNumber {

    public static int[] maximizeNumber(int[] arr, int[] rep) {
        int[] modifiedArray = Arrays.copyOf(arr, arr.length);

        int repIndex = 0;

        for (int i = 0; i < modifiedArray.length && repIndex < rep.length; i++) {
            if (modifiedArray[i] < rep[repIndex]) {
                modifiedArray[i] = rep[repIndex];
                repIndex++;
            }
        }

        return modifiedArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 4, 5};
        int[] rep = {1, 9, 6};

        int[] modifiedArray = maximizeNumber(arr, rep);

        for (int num : modifiedArray) {
            System.out.print(num);
        }
    }
}
