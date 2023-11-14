package challengeSeven.ReverseLinkedList;

import java.util.LinkedList;

public class ReverseLinkedList {

    public static void revertLinkedList(int[] nums) {

	LinkedList<Integer> linkedList = new LinkedList<Integer>();
	LinkedList<Integer> reverseList = new LinkedList<Integer>();

	for (int i = 0; i < nums.length; i++) {

	    linkedList.add(nums[i]);
	    reverseList.addFirst(nums[i]);
	}

	System.out.println(linkedList);
	System.out.println(reverseList);

    }

    public static void main(String[] args) {

	int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	revertLinkedList(nums);

    }

}
