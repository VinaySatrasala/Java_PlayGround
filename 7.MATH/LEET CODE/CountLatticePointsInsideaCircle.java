public class CountLatticePointsInsideaCircle {
    public static void main(String[] args) {
        int x=3;
        int y=4;
        int r=1;
        int forQuad=0;
        // t is distance from center
        for (int t = 0; t <=r; t++) {
            forQuad+=(int)(Math.sqrt(r*r - t*t))+1;
        }

        System.out.println(4*(forQuad-r)-3);

        /*    HashSet<String> res = new HashSet<String>();
    for(int[] arr : circles){
        int x = arr[0], y = arr[1], r = arr[2];
        for(int i=x-r; i<=x+r; i++)
            for(int j=y-r; j<=y+r; j++)
                if((x-i)*(x-i) + (y-j)*(y-j) <= r*r)
                    res.add(i+","+j);
    }
    return res.size(); */

    }
}
