import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysJava {
    
    public static void main(String[] args) {
        
        //syntax
        //datatype[] variable_name=new datatype[size];
        //int[] ar=new int[size];
        
        //breakdown

        int[] ar; //intialization
        ar=new int[5]; //object is being created in the memory heap memory
        System.err.println(ar[0]); //By default intially all integer arrays have 0's

        String[] str=new String[5];
        System.out.println(str[0]); 

        //Taking through for loop

        Scanner in =new Scanner(System.in);
        int[] m=new int[5];
        for (int i=0;i<m.length;i++){
            m[i]=in.nextInt();
        }

        //enhanced for loop to print array elements
        for(int num:m){
            System.out.println(num);
        }

        //Best way to print array 
        System.out.println(Arrays.toString(m));

        //Array of objects
        //Just a string array....

        //Multidimensional Arrays-
        //Taking input is similar
        //Best way to print 2-d arrays

        int[][] k=new int[3][3];

        //input
        for(int i=0;i<k.length;i++){
            for(int j=0;j<k[i].length;j++){
                k[i][j]=in.nextInt();
            }
        }

        //Printing array
        for (int[] ele : k) {
            System.out.println(Arrays.toString(ele));   
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        System.err.println(list);
        list.get(0);
        list.remove(0);
        list.set(0, 1);

        //Multidimensional Arraylist
        ArrayList<ArrayList<Integer>> list2=new ArrayList<>();
        for(int i=0;i<3;i++){
            list2.add(new ArrayList<>());//Intializing new arraylist inside list
        }
        for(int i=0;i<list2.size();i++){
            for(int j=0;j<3;j++){
                list2.get(i).add(i);
            }
        }
        System.out.println(list2);

        //Finding maximum number 
        int[] maxi={1,2,3,4,5,6,7,8,9};
        int max=maxo(maxi);
        System.out.println("Maxo "+max);

        //Reversing array
        reverse(maxi);
        System.out.println("Reversed :"+Arrays.toString(maxi));
    }

    //Getting maximum element in an array
    static int maxo(int[] maxi) {
        int max=0;
        for(int i:maxi){
            if (i>max){
                max=i;
            }
        }
        return max;
    }

    //Reversing array
    static void reverse(int[] maxi) {
        int start=0;
        int end=maxi.length-1;
        while(start<end){
            swap(maxi, start, end);
            start++;
            end--;
        }
        
    }

    //Swapping two elemnts in an array
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
