package challengeFour.TwoSum;

import java.util.Arrays;

/**
 * 
 * Given an array of Integers and an Integer target return indices of the two
 * numbers such that they add up to target Input: [2,7,11,15], target = 9
 * Output: 0,1
 * 
 */
public class TwoSum {

    public static void main(String[] args) {

	int[] nums = { 11, 17, 14, 17, 45, 37, 6, 4, 1, 2, 3 };
	int target = 9;

	System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int nums[], int target) {
	int[] response = new int[2];
	int len = nums.length;
	for (int i = 0; i < len; i++) {
	    for (int k = i + 1; k < len; k++) {
		int sumUP = nums[i] + nums[k];
		System.out.println(sumUP);
		if (sumUP == target) {
		    response[0] = i;
		    response[1] = k;
		    return response;
		}
	    }
	}
	return response;
    }

}
