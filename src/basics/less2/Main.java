package basics.less2;

public class Main {

	public static void main(String[] args) {
		int i = 0;
		switch (i) {
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		default:
			System.out.println("Default");
			break;
		}
		
		while(i<10){
			System.out.println(++i);
		}
		
		do {
			System.out.println(++i);
		} while (i<10);
		
		for (int j = 0; j < 10; j++) {
			System.out.println(j);
		}
		
		hello();
		int increment = increment(1);
		System.out.println(increment);
		System.out.println(add(7, 5));
		System.out.println(deduct(7, 5));
		System.out.println(multiply(7, 5));
		System.out.println(divide(7, 5));
		System.out.println(calculator(1,3, '*'));
	}
	
	static void hello(){
		System.out.println("Hello!");
	}
	
	static int increment(int i){
		i++;
		return i;
	}
	
	static double add (double a1, double a2){
		return a1 + a2;
	}
	static double deduct (double a1, double a2){
		return a1 - a2;
	}
	static double multiply (double a1, double a2){
		return a1 * a2;
	}
	static double divide (double a1, double a2){
		return a1 / a2;
	}
	
	static double calculator(double a, double b, char operator){
		switch (operator){
		case '+': return add(a, b);
		case '-': return deduct(a, b);
		case '*': return multiply(a, b);
		case '/': return divide(a, b);
		default: calculator(a, b, operator); return 0;
		}
	}
			
	
}
