import java.util.Arrays;

public class DefanginganIPAddress{
    public static void main(String[] args) {
        System.out.println(defangIPaddr("255.255.255.255"));
    }
    static String defangIPaddr(String address) {

        return address.replace(".", "[.]");
        
    }
}