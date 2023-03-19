public class WaterAndJug {
    public static void main(String[] args) {
        
    }
    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        if(targetCapacity % gcd(jug1Capacity,jug2Capacity) == 0){
            return true;
        }
        return false;
    }
    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a , a);
    }
}
