import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Hi {

    public static void main(String[] args) {
	int min = 1, max = 100;
	int size = 10;

	Set<Integer> list = new HashSet<>();
	Random random = new Random();
	size = random.nextInt(100);

	while (size > 0) {
	    int r = random.nextInt(min, max);
	    list.add(r);
	    size--;
	}
	int sumEven = 0;
	int sumOdd = 0;
	System.out.println(list);
	sumOdd = list.stream().filter(x -> x % 2 == 1).reduce(0, (x, y) -> x + y);
	sumEven = list.stream().filter(x -> x % 2 == 0).reduce(0, (x, y) -> x + y);
	System.out.println();
	System.out.println(sumEven);
	System.out.println(sumOdd);
    }

}
