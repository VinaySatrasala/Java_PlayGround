import java.util.Arrays;

public class Merging{
    public static void main(String[] args){
        int[] a1={1,2,4,5};
        int[] a2={3,6};
        int l1=a1.length;
        int l2=a2.length;
        int i1=0;
        int i2=0;
        int[] ne=new int[l1+l2];



        while((i1<l1) || (i2<l2)){
            if(i1<l1){
                if(i2>l2 || a1[i1]<a2[i2]){
                    ne[i1+i2]=a1[i1];
                    i1++;
                }
            if(i2<l2){
                if(i1>l1 || a1[i1]>a2[i2]){
                    ne[i1+i2]=a2[i2];
                    i2++;
                }
            }
            }
        }
        System.out.println(Arrays.toString(ne));

    }
}