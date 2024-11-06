import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p609 {
    public static List<List<String>> findDuplicate(String[] paths) {
        Map<String , List<String>> map = new HashMap<>();
        for(String path : paths){
            String[] spl = path.split(" ");
            // index 0 is a root
            // remaining all filenames

            String root = spl[0];
            for(int i = 1;i<spl.length;i++){
                String file = spl[i];
                String content = file.substring(file.indexOf('('));
                content = content.replace("(", "").replace(")", "");
                file = file.substring(0, file.indexOf('('));

                String final_path = root+ "/" + file;
                List<String> res = map.getOrDefault(content, new ArrayList<>());
                res.add(final_path);
                map.put(content, res);
            }
        }


        List<List<String>> res = new ArrayList<>();
        for(String key : map.keySet()){
            // System.out.println(key + " --> " + map.get(key));
            res.add(map.get(key));
        }
        return res;
    }
    public static void main(String[] args) {
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};
        System.out.println(findDuplicate(paths));
    }
}
