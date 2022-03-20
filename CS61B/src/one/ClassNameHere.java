package one;

public class ClassNameHere {
	/** Returns the Maximum value from m.*/
	public static int forMax(int[] m) {
		int le = m.length;
		int max = m[0];
		for (int i = 0; i < m.length; i += 1) {
			if (max < m[i]) {
				max = m[i];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
		System.out.println(forMax(numbers));
		
	}

}
