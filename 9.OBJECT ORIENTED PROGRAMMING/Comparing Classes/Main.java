public class Main {
    public static void main(String[] args) {
        Student v = new Student(1,10);
        Student s= new Student(2,20);


        if(v.compareTo(s) == 0){
            System.out.println("Yes");
        }

    }
}
