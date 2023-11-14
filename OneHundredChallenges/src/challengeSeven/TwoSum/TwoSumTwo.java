package challengeSeven.TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumTwo {

    public static int[] duplicates(int[] nums, int target) {

	int[] response = new int[2];
	int len = nums.length;
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	for (int i = 0; i < len; i++) {

	    if (map.containsKey(nums[i])) {
		response[0] = map.get(nums[i]) + 1;
		response[1] = i + 1;
		return response;
	    }
	    map.put(target - nums[i], i);
	}
	System.out.println(map);

	return response;
    }

    public static int[] duplicatesWithPointers(int[] nums, int target) {

	int[] out = new int[2];

	int start = 0;
	int end = nums.length - 1;

	while (start < end) {

	    int sum = nums[start] + nums[end];

	    if (sum == target) {
		out[0] = start + 1;
		out[1] = end + 1;
		return out;

	    } else if (sum > target) {
		end--;
	    } else {
		start++;
	    }

	}

	return out;
    }

    public static void main(String[] args) {
	int[] nums = { 1, 2, 50, 37, -27, 89, -12, 41, 45, 7 };
	int target = 77;
	System.out.println("Given the list: " + Arrays.toString(nums));
	System.out.println("Position of the indices that add up to sum: " + target + " = "
		+ Arrays.toString(duplicates(nums, target)));

	System.out.println(Arrays.toString(duplicatesWithPointers(nums, target)));
    }

}
