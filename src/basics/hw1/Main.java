package basics.hw1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть число:");
		int n = sc.nextInt();
	        if( n % 2 == 0) {
	            System.out.println("„исло " + n + " парне");
	        } else {
	            System.out.println("„исло " + n + " непарне");
	        }
/* --------------------------------------------------------- */	        
	        
		double res1 = 0;
		double res2 = 0;
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("¬вед≥ть число 1:");
		double a = sc2.nextDouble();
		System.out.println("¬вед≥ть число 2:");
		double b = sc2.nextDouble();
		
		if (a >= 10){ 
			res1 = a - 10; 
		} else { 
			res1 = 10 - a; 
		} 

		if (b >= 10){ 
			res2 = b - 10; 
		} else { 
			res2 = 10 - b; 
		} 

		if (res1 < res2) { 
			System.out.println("„исло " + a+" ближче до числа 10"); 
		} else if(res1 > res2){ 
			System.out.println("„исло " + b+" ближче до числа 10"); 
		} else { 
			System.out.println("„исла р≥внов≥ддален≥ в≥д числа 10"); 
		}
	}
}
