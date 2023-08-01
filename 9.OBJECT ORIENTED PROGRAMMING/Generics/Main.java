import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();
        list.add(10);
        System.out.println(list);

        CustomArrayList<String> ls = new CustomArrayList<>();
        ls.add("Hello");
        List<? extends Number> lis = new ArrayList<>();
        lis.add((Number)1);

    }
}
