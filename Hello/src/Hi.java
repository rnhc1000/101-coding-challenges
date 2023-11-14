import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hi {

    public static void main(String[] args) {
	int min = 1, max = 10;
	int size = 10;
	List<Integer> list = new ArrayList<>();
	while (size > 0) {
	    Random random = new Random();
	    int r = random.nextInt(min, max);
	    list.add(r);
	    size--;
	}
	int sumEven = 0;
	int sumOdd = 0;
	System.out.println(list);
	sumEven = list.stream().filter(x -> x % 2 == 0).reduce(0, (x, y) -> x + y);
	sumOdd = list.stream().filter(x -> x % 2 == 1).reduce(0, (x, y) -> x + y);
	System.out.println(sumEven);
	System.out.println(sumOdd);
    }

}
