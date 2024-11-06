import java.util.ArrayList;

public class SubSetsOfABC{
    public static void main(String[] args) {
        // f3("abc" , "");
        System.out.println(helper("abc"));
        // System.out.println(f2("abc", ""));
    }

    // Printig all subsets EASY
    static void f(String up,String p){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        f(up.substring(1) , (p+up.charAt(0)));
        f(up.substring(1) , (p));

    }


    // Adding to array list with passing argument as array list MEDIUM
    static ArrayList<String> helper(String up){
        ArrayList<String> subsets=new ArrayList<>();
        f1(up, "", subsets);
        return subsets;
        
    }
    // we cannot return this function with array list beacuse only recursive tree can be achived for right we cannot go
    static void f1(String up,String p,ArrayList<String> ans){
        if(up.isEmpty()){
            ans.add(p);
            return;
        }

        f1(up.substring(1) , (p+up.charAt(0)) , ans);
        f1(up.substring(1) , (p) , ans);

    }


    // Making array list inside function body and returnig it HARD
    static ArrayList<String> f2(String up , String p){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> left = f2(up.substring(1) , (p+up.charAt(0)));
        ArrayList<String> right = f2(up.substring(1) , (p));

        left.addAll(right);

        return left;
    }

    // Making Subsets incudeing ascii values of a char
    static void f3(String up,String p){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        f3(up.substring(1) , (p+up.charAt(0)));
        f3(up.substring(1) , (p));
        f3(up.substring(1) , (p+((int)up.charAt(0))));

    }

}