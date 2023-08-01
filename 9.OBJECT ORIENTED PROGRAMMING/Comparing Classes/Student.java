public class Student implements Comparable<Student>{
    int Roll;
    float Marks;
    public Student(int Roll , float Marks){
        this.Roll = Roll;
        this.Marks = Marks;
    }

    // One can write own logic for comparing objects
    
    @Override
    public int compareTo(Student o) {
        return 0;
    }


    
}