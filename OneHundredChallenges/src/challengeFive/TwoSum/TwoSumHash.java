package challengeFive.TwoSum;

/**
 * Goal: Find the position of the two numbers that
 * add up to the target...
 * TwoSum using only one for loop and a HashMap
 * Input:
 * int [] nums = { 1,2,3,4,5 }
 * target: 8
 * Hint:
 * The values of nums will become the Key of a HashMap
 * and the index of each number in nums the Value..
 * Initialize a HashMap and check if the map contains the key(nums[index])
 * If not, make the difference between target and nums[index] and add a pair (K,V) as
 * diff,index...
 * Repeat it for each item in nums, adding the pairs(K,V)...
 * When the diff looked for is found, recover the first index
 * thru map.get(nums[index]) and the current index...
 * 
 * int[] nums = { 1, 3, 5, 7, 9, 11, 15, 17 };
 * int target = 10;
 * 
 * {-1=5, 1=4, 3=3, -5=6, 5=2, -7=7, 7=1, 9=0}
 * [0, 4]
 * When index = 4, already exists a key 9 at position
 * zero in map...so recover its position and current index and voila
 * the pair [0,4] is found...
 * 
 * for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
 * 
 *     System.out.println(entry.getKey() + " " + entry.getValue());
 *     
 * }
 * 
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumHash {

    public static void main(String[] args) {

	int target = 10;
	int[] nums = { 1, 3, 5, 7, 9, 11, 15, 17 };

	System.out.println(Arrays.toString(twoSum(nums, target)));

    }

    public static int[] twoSum(int nums[], int target) {

	Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	int[] response = new int[2];

	for (int k = 0; k < nums.length; k++) {

	    if (map.containsKey(nums[k])) {
		response[0] = map.get(nums[k]);
		response[1] = k;
		return response;
	    }

	    map.put(target - nums[k], k);
	}

	return response;

    }

}
