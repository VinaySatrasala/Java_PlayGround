// This is also called as runtime / Dynamin polymorphism


class Shape{
    void area(){
        System.out.println("In shape");
    }

    // Cannot be overiden if declared as
    final void areaPrint(){

    }
}

class Square extends Shape{

    @Override
    void area(){
        System.out.println("In square");
    }


    // void areaPrint() 


}
public class OverRiding {    
    public static void main(String[] args) {
        
    }
}
