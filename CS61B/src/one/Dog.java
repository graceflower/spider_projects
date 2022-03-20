package one;

public class Dog {
	public int weightInPounds;
	
	public Dog(int w) {
		weightInPounds = w;
	}
	
	public static Dog maxDog(Dog d1, Dog d2) {
		if(d1.weightInPounds > d2.weightInPounds) {
			return d1;
		}
		return d2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
