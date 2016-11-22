package basics.hw2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//task1();
		//task2();
		//task3();
		//task4();
		//task5();
		//task6();
		//task7();
		//task8();
	}
	static void task1(){
		for(int a = 1000; a < 10000; a += 3){
			System.out.println(a);
		}
	}
	static void task2(){
		for(int b = 1, i = 1; i <= 55; i++, b += 2){
			System.out.println(b);
			
		}
	}
	static void task3(){
		for(int c = 90; c >= 0; c -= 5){
			System.out.println(c);
			
		}
	}
	static void task4(){
		for(int d = 2, i = 1; i <= 20; i++){
			System.out.println(d);
			d *= 2;
		}
	}
	static void task5(){
		for(int e = 2; e < 10000; e = 2 * e - 1){
			System.out.println(e);
			
		}
	}
	static void task6(){
		for(int f = -166; f < 100; f = 2 * f + 200){
			if(f > -100 && (f < -9 || f > 9)){
				System.out.println(f);
			}
		}
	}
	static void task7(){
        int n = 0;
		do {
            Scanner scan = new Scanner(System.in);
            System.out.print("¬вед≥ть число: ");
            n = scan.nextInt();
            int g = 1;
            for (int i = 2; i <= n; i++){
            	g = g * i;
            	System.out.println(g);
            }
            if (n == 0 || n == 1){
            	System.out.println(g);
            }
            if(n < 0){
            System.out.println("¬ведено хибне число!");
            }
        } while (n < 0);
   	}
	static void task8(){
		Scanner sc = new Scanner(System.in);
        System.out.print("¬вед≥ть число: ");
        double h = sc.nextDouble();
        for(double i = 1; i <= h; i++){
            if ((h % i) == 0){
               System.out.println(i);
             }
         }
	}
}
