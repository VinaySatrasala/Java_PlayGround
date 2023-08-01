public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }


    // takes objects
    // It is same as creating box obj using instance of boxweight
    BoxWeight(BoxWeight other) {
          
        super(other);
    }

    public BoxWeight(double l,double b,double h,double weight) {
        
        // Super describes about object of the parent class
        // if any class is not inheriting then super point to object class by default
        // super can also be used for accessing parent class variables
        // Super can also be used for calling construcors of same class if not exetend
        // if extended then used for accessing parent class constructors
        // Super should be at the begining
        super(l, b, h);

        this.weight = weight;
    }

}
