import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UndergroundSystem {
    public class udc{
        String name ;
        int time;
        public udc(String name , int time){
            this.name = name;
            this.time = time;
        }
        @Override
        public String toString() {
            return " sname=" + name + ", time=" + time;
        }
        
    }

    Map<Integer , udc> in;

    // Stores time takes from source to destination -- > List<sum oftime , count >
    Map<String , List<Double> >  time;

    public UndergroundSystem() {
        in = new HashMap<>();
        time = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        udc user = new udc(stationName , t);
        in.put(id , user);
    }
    
    public void checkOut(int id, String stationName, int t) {
        udc user = in.remove(id);

        // Travel time 
        double ttime = t - user.time;

        String concatStations = user.name +" "+ stationName;

        List<Double> res = time.getOrDefault(concatStations, new ArrayList<>());

        if(res.isEmpty()){
            res.add(ttime);
            res.add((double)1);
        }else{
            double tim = res.remove(0) + ttime;
            double count = res.remove(0) + 1;
            res.add(tim);
            res.add(count);
        }

        time.put(concatStations, res);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String conStatons = startStation +" "+ endStation;
        List<Double> res = time.get(conStatons);
        return res.get(0) / res.get(1);
    }


    public static void main(String[] args) {
        UndergroundSystem obj = new UndergroundSystem();


        obj.checkIn(45,"a",3);
        obj.checkIn(32,"aa",8);
        obj.checkIn(27,"a",10);



        obj.checkOut(45,"ab",15);
        obj.checkOut(27,"ab",20);
        obj.checkOut(32,"b",22);

        System.out.println(obj.getAverageTime("aa","b"));
        System.out.println(obj.getAverageTime("a","ab"));


        obj.checkIn(10,"a",24);

        System.out.println(obj.getAverageTime("a","ab"));


        obj.checkOut(10,"ab",38);

        System.out.println(obj.getAverageTime("a","ab"));


        System.out.println(obj.in);
        System.out.println(obj.time);
    }
}
