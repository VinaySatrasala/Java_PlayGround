import java.util.ArrayList;
import java.util.List;

public class PathInZigzagLabelledBinaryTree {
    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> list = new ArrayList<>();

        int row = Integer.toBinaryString(label).length() - 1;
        int comp = (int)(Math.pow(2,row) - 1);
        int pos = label - comp;
        while(row > -1){
            int row_start = (int)(Math.pow(2, row));
            if(row %2 == 0){
                list.add(row_start + pos);
            }else{
                int elements_in_row = (int)(Math.pow(2, row));
                int pos_back = elements_in_row - pos + 1;
                list.add(row_start + pos_back);
            }

            if(pos % 2 == 0){
                pos = pos/2;
            }else{
                pos = pos/2;
                pos++;
            }

            row--;
        }

        return list;
    }
}
