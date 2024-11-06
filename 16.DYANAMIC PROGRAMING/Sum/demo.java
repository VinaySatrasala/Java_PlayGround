import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class demo {
    public static void main(String[] args) {

        List<List<Integer>> ls = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);

        List<Integer> l2 = new ArrayList<>();
        l2.add(4);
        l2.add(5);
        ls.add(l1);
        ls.add(l2);



        List<Integer> l3 = new ArrayList<>(ls.get(0));
        List<List<Integer>> l4= new ArrayList<>(ls);
        l4.add(l1);

        l3.add(3);
        System.out.println(l4);

        for (List<Integer> list : l4) {
            list.add(0);
        }
        System.out.println(l4);
        System.out.println(ls);

    }
}
