
public class Main {

	// 상수 선언
	final static double PI = 3.141592;
	
	public static void main(String[] args) {
		
		// 여러가지 자료형 변수 실습
		int intType = 100;
		double doubleType = 150.5;
		String stringType = "jyp";
		
		System.out.println(intType);
		System.out.println(doubleType);
		System.out.println(stringType);
		
		// 상수 활용
		int r = 30;
		double area = r * r * PI;
		System.out.println(area);
		r = 20;
		System.out.println(area);
		area = r * r * PI;
		System.out.println(area);
		
		// 오버플로우 실습
		System.out.println(1000000000 * 10);
		System.out.println(2147483647 + Math.abs(-2147483648) + 1);
		System.out.println(Math.pow(3, 20));
		System.out.println((int) Math.pow(3, 20));
		System.out.println((int) Math.pow(3, 20) + 1);
	}

}
