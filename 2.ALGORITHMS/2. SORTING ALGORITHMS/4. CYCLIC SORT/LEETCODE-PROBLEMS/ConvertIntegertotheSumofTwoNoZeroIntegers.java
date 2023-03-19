public class ConvertIntegertotheSumofTwoNoZeroIntegers {
    public static void main(String[] args) {
        int n=1009;
        int i=1;
        while(true){
            if(!(""+i).contains("0") && !(""+(n-i)).contains("0")){
                // return new int[]{i,n-1};
                break;
            }
            i++;
        }
        System.out.println(i);
        // return new int[]{1,1};
    }
}
