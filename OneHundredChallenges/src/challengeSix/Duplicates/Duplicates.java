package challengeSix.Duplicates;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Given an array of n items, find if the array contains duplicates
 * 
 */
public class Duplicates {

    public static boolean duplicates(int[] nums) {

	int countDuplicates = 0;
	int len = nums.length;

	if (len < 2) {
	    return false;
	}

	for (int i = 0; i < len; i++) {
	    for (int j = i + 1; j < len; j++) {

		if (nums[i] == nums[j]) {
		    countDuplicates++;
		}
	    }
	}

	return countDuplicates > 0 ? true : false;

    }

    public static String containsDuplicates(int[] nums) {

	Set<Integer> set = new HashSet<Integer>();

	int len = nums.length;

	for (int i : nums) {
	    set.add(i);
	}

	if (len != set.size()) {

	    return "Duplicates exist!!!";
	}

	return "No duplicates";
    }

    public static boolean duplicatesAgain(int[] nums) {

	Arrays.sort(nums); // O(logn)
	int len = nums.length;

	for (int i = 1; i < len; i++) {

	    if (nums[i] == nums[i - 1]) {
		return true;
	    }
	}

	return false;
    }

    public static void main(String[] args) {

	int[] nums = { 2, 3, 4, 5, 6, 7, 8, 9, 0 };

	System.out.println(duplicates(nums));
	System.out.println(containsDuplicates(nums));
	System.out.println(duplicatesAgain(nums));

    }

}
