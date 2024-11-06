import java.util.Random;

public class RandomStringJenerator {
    static String randoString(int size){
        Random random = new Random();
        // This will return float values from 0.0 to 1.0
        System.out.println(random.nextFloat());
        StringBuffer buffer = new StringBuffer();
        // So to generate a string of length size will need multiply random with 26 will give us 0 to 26
        for (int i = 0; i < size; i++) {
            int rand = (int)(26 * random.nextFloat()) % 26;
            char c = (char)(97 + rand);

            buffer.append(c);
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(randoString(10));
    }
}
