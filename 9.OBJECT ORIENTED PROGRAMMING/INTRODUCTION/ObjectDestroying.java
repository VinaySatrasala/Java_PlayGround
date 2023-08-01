public class ObjectDestroying {
    public static void main(String[] args) {
        A obj ;
        for(int i = 0;i<1000000;i++){
            obj = new A("vinaay");
        }
    }

}

class A{
    String name;
    A (String name){
        this.name = name;
    }


    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("Object Destroyed");
    }
}
