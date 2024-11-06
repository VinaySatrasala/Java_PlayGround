import java.util.*;


public class NumberofBurgerswithNoWasteofIngredients {
    public static void main(String[] args) {
        System.out.println(numOfBurgers(4, 17));
    }
    static List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        int jCount = 0, // x
		sCount = 0; // y

	// 4x + 2y = tomatoSlices
	// x + y = cheeseSlices

	if ((4*cheeseSlices - tomatoSlices) < 0 || (4*cheeseSlices - tomatoSlices) % 2 != 0) {
		return Collections.emptyList();
	}

	sCount = (4*cheeseSlices - tomatoSlices) / 2;
	jCount = cheeseSlices - sCount;

    return Arrays.asList(jCount, sCount);
    }
}
