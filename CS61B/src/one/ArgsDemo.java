package one;

public class ArgsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 0; i < args.length; i += 1) {
			sum =  sum + Integer.parseInt(args[i]);
		}
		System.out.println(sum);

	}

}
