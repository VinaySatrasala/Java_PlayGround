public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
        // System.out.println(701/26);
        // int n=701;
        // while (n!=0) {
        //     n=n/26;
        //     System.out.println((char)(96+n));
            
        // }
    }
    static String convertToTitle(int n) {
        String result = "";
         
         while(n > 0) {
             n --;
             result = (char)('A' + (n % 26)) + result;
             n = n / 26;
         }
         return result;
      }
}   
