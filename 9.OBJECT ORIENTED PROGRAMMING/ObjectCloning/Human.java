public class Human implements Cloneable{
    String Name;

    public Human(String name) {
        this.Name = name;
    }

    public Human(Human obj) {
        this.Name = obj.Name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    
    
}