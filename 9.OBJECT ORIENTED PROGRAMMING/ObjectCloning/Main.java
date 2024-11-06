public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        // Cloning objects like this might take a lot of processing time so dont use this insted implement cloanabke interface
        Human vinay = new Human("Vinay");
        Human twin  = new Human(vinay);


        Human other = (Human) vinay.clone();


        int[] k = new int[10];
        int[]p = k.clone();
    }
}
