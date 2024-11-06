import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p690 {
    public class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }
    Map<Integer , Employee> map = new HashMap<>();
    public int getImportance(List<Employee> employees, int id) {
        for(Employee e : employees){
            map.put(e.id, e);
        }


        return find(map.get(id));
    }

    public int find(Employee e){
        if(e.subordinates.size() == 0){
            return e.importance;
        }
        int imp = e.importance;
        for(Integer i:e.subordinates){
            imp+=find(map.get(i));
        }

        return imp;
    }
}
