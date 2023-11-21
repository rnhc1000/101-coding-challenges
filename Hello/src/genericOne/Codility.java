package genericOne;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * This is a demo task. Write a function: class Solution { public int
 * solution(int[] A); } that, given an array A of N integers, returns the
 * smallest positive integer (greater than 0) that does not occur in A. For
 * example, given A = [1, 3, 6, 4, 1, 2], the function should return 5. Given A
 * = [1, 2, 3], the function should return 4. Given A = [−1, −3], the function
 * should return 1. Write an efficient algorithm for the following assumptions:
 * N is an integer within the range [1..100,000]; each element of array A is an
 * integer within the range [−1,000,000..1,000,000].
 */

public class Codility {

    public static void main(String[] args) {

	Random random = new Random();

	int sizeOfNums = random.nextInt(10, 20);

	Integer[] nums = new Integer[sizeOfNums];

	for (int i = 0; i < nums.length; i++) {

	    nums[i] = random.nextInt(1, 20);

	}

	List<Integer> list = Arrays.asList(nums);

	List<Integer> sortedList = new ArrayList<>();

	sortedList = list.stream().sorted(Comparator.naturalOrder()).toList();

	System.out.println(sortedList);

	Integer r = solution(sortedList);
	System.out.println(r);

    }

    public static Integer solution(List<Integer> num) {

	int len = num.size();
	Set<Integer> newA = new HashSet<>();
	int count = 1;
	int max = 0;
	for (Integer i : num) {
	    if (i > max) {
		newA.add(i);
	    }
	}

	for (; count <= len + 1; count++) {

	    if (!newA.contains(count)) {
		return count;
	    }
	}
	return count;
    }
}
