public class EvenDigitsInNumber {
    public static void main(String[] args) {
        int[] array={12,345,2,6,7896};
        int count=numofdig(array);
        System.out.println(count);

        //Appraoch 2
        count=usingstring(array);
        System.out.println(count);

        //Approach 3
        count=usinglog(array);
        System.out.println(count);
    }

    //Approach 1
    static int numofdig(int[] array) {
        int count=0;
        for(int i:array){
            int j=0;
            while(i>0){
                i=i/10;
                j=j+1;
            }
            if(j%2==0){
                count=count+1;
            }
        }
        return count;
    }

    //Approach 2
    static int usingstring(int[] array){
        int count=0;
        for(int i:array){
            String str=i+"";
            if(str.length()%2==0){
                count++;
            }
        }
        return count;
    }

    //Approach 3
    static int usinglog(int[] array){
        int count=0;
        for(int i : array){
            if (((int)(Math.log10(i))+1)%2==0){
                count++;
            }
        }
        return count;
    }
}
