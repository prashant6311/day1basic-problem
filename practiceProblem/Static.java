package practiceProblem;

public class Static {

	static int a = 10;
	static int b;

	static void func(int c) {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}

	static {
		System.out.println("static bolck");
		b = a + 5;
	}

	public static void main(String[] args) {

		func(20);
	}

}
