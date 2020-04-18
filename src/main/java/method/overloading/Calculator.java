package method.overloading;

public class Calculator {

	public double add(float a, double b) {
		System.out.println("float and double");
		return a + b;
	}

	public double add(double a, float b) {
		System.out.println("double and float");
		return a + b;
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(20d, 10f);
		c.add(20f, 10d);
		// c.add(1f, 1f);

	}

}
