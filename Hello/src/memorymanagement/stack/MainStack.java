package memorymanagement.stack;

public class MainStack {
    public static void main(String[] args) {
	int x = 1;
	int y = 2;
	final int result = sum(x, y);
	System.out.println(result);
    }

    private static int sum(int a, int b) {

	final int s = a + b;
	return s;
    }

}
