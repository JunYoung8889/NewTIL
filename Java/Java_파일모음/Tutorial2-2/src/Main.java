
public class Main {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		System.out.println("a + b = " + (a + b));
		System.out.print("a - b =");
		System.out.print(a - b + "\n");
		System.out.printf("a / b = %d \n", a/b);
		System.out.println("a * b = " + a * b);
		
		double c = 1.0;
		float d = 3.0f;
		int e = 1;
		
		System.out.println("c / d = " + c/d);
		System.out.println("e / d = " + e/d);
		
		double f = 3e6;
		float g = 3e5f;
		double h = 2e-3;
		
		System.out.println("3e6 = " + f);
		System.out.println("3e5f = " + g);
		System.out.println("2e-3 = " + h);
	}

}
