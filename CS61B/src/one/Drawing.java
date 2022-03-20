package one;

public class Drawing {
	/** This method is used to draw triangle with tall of any number*/
	public static void drawTriangle(int x) {
		int tall = 1;
		while (tall <= x) {
			int rep = tall;
			while (rep > 0) {
				System.out.print("*");
				rep = rep - 1;
			}
			System.out.println("");
			tall = tall + 1;
		}
	}
	
	public static void main(String[] args) {
		drawTriangle(10);
	}

}
