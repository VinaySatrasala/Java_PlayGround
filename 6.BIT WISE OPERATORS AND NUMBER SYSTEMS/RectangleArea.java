public class RectangleArea {
    public static void main(String[] args) {

        System.out.println(computeArea(-3,0,3,4,0,-1,9,2));
    }
    static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area_1=Math.abs((ax1-ax2)*(ay1-ay2));
        int area_2=Math.abs((bx1-bx2)*(by1-by2));

        int cx1=Math.max(ax1, bx1);
        int cy1=Math.max(ay1, by1);
        int cx2=Math.min(ax2,bx2);
        int cy2=Math.min(ay2, by2);
        
        int intersection_area=Math.abs((cx1-cx2)*(cy1-cy2));

        
        return area_1+area_2-intersection_area;


    }
}
