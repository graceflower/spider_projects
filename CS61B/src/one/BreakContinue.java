package one;

public class BreakContinue {
//	public static void windowPosSum(int[]  a, int n) {
//		for (int i = 0; i < a.length; i += 1) {
//			if (a[i] < 0) {
//				continue;
//			}
//			if (i + n < a.length) {
//				for (int j = i + 1; j <= i + n; j += 1) {
//					a[i] = a[i] + a[j];
//				}
//			} else {
//				for (int j = i + 1; j < a.length; j += 1) {
//					a[i] = a[i] + a[j];
//				}
//			}
//		}
//				
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		switch (a) {
		case 12:
			System.out.println("It is December.");
		case 1:
		case 2:
		case 11:
			System.out.println("It is cold.");
		default:
			System.out.println("It is hot.");
		}

	}

}
