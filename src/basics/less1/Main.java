package basics.less1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello");
		byte by = 1;
		short sh = 2;
		int i = 2;
		long lo = 4000000000L;
		float fl = 5.5f;
		double doub = 3.15;
		char ch = 'f';
		boolean bool = false;
		
		if(i>0){
			System.out.println("True");
		}else if(!bool){
			System.out.println("False");
		}else{
			System.out.println("Second else");
		}
		
		double a = 2;
		double b = 6;
		double c = 3;
		double D = b * b - 4 * a * c;
		if(D<0){
			System.out.println("Розв'язків немає");
		}else if(D>0){
			double x1 = (-b - Math.sqrt(D)) / (2 * a);
			double x2 = (-b + Math.sqrt(D)) / (2 * a);
			System.out.println("x1= " + x1 + "\nx2 = " + x2);
		}else{
			System.out.println("x=" + (-b / 2 * a));
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int res = sc.nextInt();
		System.out.println(res);
	}
}
