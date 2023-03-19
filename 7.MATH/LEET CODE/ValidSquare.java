public class ValidSquare {
    public static void main(String[] args) {
        
    }
    static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int p1p3=(p1[0]-p3[0])*(p1[0]-p3[0]) + (p1[1]-p3[1])*(p1[1]-p3[1]);
        int p2p4=(p2[0]-p4[0])*(p2[0]-p4[0]) + (p2[1]-p4[1])*(p2[1]-p4[1]);

        int p1p2=(p1[0]-p2[0])*(p1[0]-p2[0]) + (p1[1]-p2[1])*(p1[1]-p2[1]);
        int p2p3 = (p3[0]-p2[0])*(p3[0]-p2[0]) + (p3[1]-p2[1])*(p3[1]-p2[1]);
        if(p1p3 == p2p4){
            if(p1p2 == p2p3){
                return true;
            }
        }
        return false;

    }
}
