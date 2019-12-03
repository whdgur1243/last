package calc;

public class Calculator {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		System.out.println("add "+calc.add(1, 1));
		System.out.println("minu "+calc.minu(3, 1));
		System.out.println("mult "+calc.mult(2, 1));
		System.out.println("divi "+calc.divi(4, 2));
		
	}
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int minu(int a, int b) {
		return a - b;
	}
	
	public int mult(int a, int b) {
		return a * b;
	}

	public int divi(int a, int b) {
		return a / b;
	}
	
}
