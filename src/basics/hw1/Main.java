package basics.hw1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �����:");
		int n = sc.nextInt();
	        if( n % 2 == 0) {
	            System.out.println("����� " + n + " �����");
	        } else {
	            System.out.println("����� " + n + " �������");
	        }
/* --------------------------------------------------------- */	        
	        
		double res1 = 0;
		double res2 = 0;
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("������ ����� 1:");
		double a = sc2.nextDouble();
		System.out.println("������ ����� 2:");
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
			System.out.println("����� " + a+" ������ �� ����� 10"); 
		} else if(res1 > res2){ 
			System.out.println("����� " + b+" ������ �� ����� 10"); 
		} else { 
			System.out.println("����� ����������� �� ����� 10"); 
		}
	}
}
