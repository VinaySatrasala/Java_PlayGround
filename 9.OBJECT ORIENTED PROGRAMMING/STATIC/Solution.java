import java.io.*;

class Result{
    public static int findParent(int processNumber){
        int start = 1;
        int parent = 1;
        boolean found = false;
        while (!found) {
            int end = start+parent - 1;
            if(start<= processNumber && processNumber <= end){
                break;
            }
            int temp = parent;
            parent = start;
            start = start + parent;
        }
        return parent;
    }
}

public class Solution {
    
    public static void main(String[] args) {
        // System.out.println(findParent(3));
    }
}
