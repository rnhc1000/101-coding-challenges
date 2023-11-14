package challengeFive.TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumHash {

    public static void main(String[] args) {
	int[] nums = { 1, 3, 5, 7, 9, 11, 15, 17 };
	int target = 8;

	System.out.println(Arrays.toString(twoSum(nums, target)));

    }

    public static int[] twoSum(int nums[], int target) {
	int[] response = new int[2];
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	for (int i = 0; i < nums.length; i++) {
	    map.put(i, nums[i]);
	}
	/**
	 * {0=1, 1=3, 2=5, 3=7, 4=9, 5=11, 6=15, 7=17}
	 * 
	 */

//	map.forEach((k, v) -> v += v));
	for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

	    System.out.println(entry.getKey() + " " + entry.getValue());

	}
	int sum = 0;

//	System.out.println(map.get(1));
//	System.out.println(map);

	int first = map.get(0);
	int diff = target - first;
//	System.out.println(diff);
	System.out.println(map.containsValue(diff));
	for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	    if (map.containsValue(diff)) {

		System.out.println("Key: " + entry.getKey());
	    }

//	    System.out.print("Sum: " + (sum += j) + " ");
	}

	return response;

    }

}
