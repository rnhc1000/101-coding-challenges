package challengeNine.ValidPalindrome;

import java.util.Arrays;

public class ValidPalindrome {

    /**
     * @param s1
     * @param s2
     * @return true | false
     */
    public static boolean isAnagram(String s1, String s2) {

	s1 = s1.toLowerCase().replace(" ", "");
	s2 = s2.toLowerCase().replace(" ", "");

	char[] c1 = s1.toCharArray();
	char[] c2 = s2.toCharArray();

	Arrays.sort(c1);
	Arrays.sort(c2);

	StringBuilder stringOne = new StringBuilder("");
	StringBuilder stringTwo = new StringBuilder("");

	for (char c : c1) {
	    stringOne.append(c);
	}

	for (char c : c2) {
	    stringTwo.append(c);
	}

	return stringOne.toString().equals(stringTwo.toString()) ? true : false;

    }

    /**
     * @param s
     * @return true | false
     */

    public static boolean isPalindrome(String s) {

	String pattern = "([^a-zA-Z0-9]\\s*)";
	String updated = s.replaceAll(pattern, "");

	char[] c = updated.toLowerCase().toCharArray();
	int len = c.length;
	int end = len - 1;
	int start = 0;

	while (start != end) {
	    if (c[start] != c[end]) {
		return false;
	    } else {
		start++;
		end--;
	    }
	}

	return true;
    }

    public static void main(String[] args) {

	String s1 = "The quick brown fox dog jumps over the lazy dog";
	String s2 = "Brown quick the dog fox over jumps dog lazy the";

	System.out.println(isAnagram(s1, s2));

	String s3 = "A man, a plan, a canal: Panama";
	String s4 = "Race a eCar";

	System.out.println(isPalindrome(s4));
    }

};