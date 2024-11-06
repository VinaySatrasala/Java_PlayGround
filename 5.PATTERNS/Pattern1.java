public class Pattern1{
    public static void main(String[] args) {
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // *
        // * *
        // * * *
        // * * * *
        // * * * * *

        System.out.println();

        for(int i=1;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

        System.out.println();

        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4 
        // 1 2 3 4 5

        System.out.println();

        for(int i=1;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }

        System.out.println();

        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

        for(int i=1;i<=10;i++){
            int cols= i>5 ? 10-i :i;
            for (int j = 0; j < cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    //      *
    //     * *
    //    * * *
    //   * * * * 
    //  * * * * *
    //   * * * *
    //    * * *
    //     * *
    //      *

        for(int i=1;i<=10;i++){
            int cols= i>5 ? 10-i :i;
            int spaces=Math.abs(5-i);
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <=5; i++) {
            int spaces=Math.abs(5-i);
            for (int j = 0; j <=spaces; j++) {
                System.out.print("  ");
            }
            // for (int k = i; k >=2; k--) {
            //     System.out.print(k+" ");
            // }
            // for(int m=1;m<=i;m++){
            //     System.out.print(m+" ");
            // }
            for (int j = i; j > 1; j--) {
                System.out.print(j+" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println();

        for(int i=1;i<=7;i++){
            int cols= i>=4 ? 8-i :i;
            for (int j = 4; j >=5-cols; j--) {
                System.out.print(j+" ");
            }
            for(int k=1;k<=7-2*cols;k++){
                System.out.print(5-cols+" ");
            }
            for (int j = 5-cols; j <=4 ; j++) {
                if(j!=1){
                    System.out.print(j+" ");
                }
            }
            System.out.println();

        }
        ExcellntPattern();
    }
    static void ExcellntPattern(){
        System.out.println();
        for (int i = 0; i <=8 ; i++) {
            for (int j = 0; j <=8; j++) {
                int val=Math.min(Math.min(i, j), Math.min(8-i, 8-j));
                System.out.print(4-val+" ");                
            }            
            System.out.println();
        }
    }
}