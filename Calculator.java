public class Calculator{

	private final String resultMessage = "%d %s %d = %d";
	private final String resultAsDoubleMessage = "%d %s %d = %f";
	
	public static void main(String[] args) {
	
		new Calculator().calculatorRunner();
	
		
	}

	private void calculatorRunner() {
	
		add(3 , 4);
		subtract(8 , 4);
		multiply(8 , 4);
		modulus(8 , 4);
		divide(8 , 3);
	}
	
	public void add(int x, int y) {
		
		System.out.println(String.format(resultMessage, x, "+" ,y, (x + y)));
	}
		
	public void subtract(int x, int y) {
		
		System.out.println(String.format(resultMessage, x, "-" ,y, (x - y)));
	}
	
	public void multiply(int x, int y) {
		
		System.out.println(String.format(resultMessage, x, "*" ,y, (x * y)));
	}
	
	public void divide(int x, int y) {
		
		System.out.println(String.format(resultAsDoubleMessage, x, "/" ,y, ((double) x / (double)y)));
	}
	
	public void modulus(int x, int y) {
		
		System.out.println(String.format(resultMessage, x, "mod" ,y, (x % y)));
	}
}