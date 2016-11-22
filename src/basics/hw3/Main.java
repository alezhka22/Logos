package basics.hw3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть число операції яку хочете обчислити:"
				+ "\n1. Площа фігури" + "\n2. Об'єм тіла" + "\n3.Площа поверхні тіла");
		int formulae = sc.nextInt();
		if (formulae == 1) {
			System.out.println("Виберіть фігуру:" + "\n1.Круг"
					+ "\n2.Трикутник" + "\n3.Прямокутник" + "\n4.Паралелограм"
					+ "\n5.Трапеція");
			int checks = sc.nextInt();
			switch (checks) {
			case 1:
				System.out.println("Площа круга: " + circle());
				break;
			case 2:
				System.out.println("Площа трикутника: " + triangle());
				break;
			case 3:
				System.out.println("Площа прямокутника: " + rectangle());
				break;
			case 4:
				System.out.println("Площа паралелограма: " + parallelogram());
				break;
			case 5:
				System.out.println("Площа трапеції: " + trapeze());
				break;
			default:
				System.out.println("Введено невірне число!");
			}
		} else if (formulae == 2) {
			System.out.println("Виберіть тіло:" + "\n1.Куля" + "\n2.Конус" + "\n3.Зрізаний конус"
					+ "\n4.Циліндр" + "\n5.Піраміда" + "\n6.Зрізана піраміда" + "\n7.Призма");
			int checkv = sc.nextInt();
			switch (checkv) {
			case 1:
				System.out.println("Об'єм кулі: " + ball());
				break;
			case 2:
				System.out.println("Об'єм конуса: " + cone());
				break;
			case 3:
				System.out.println("Об'єм зрізаного конуса: " + frustum());
				break;
			case 4:
				System.out.println("Об'єм циліндра: " + cylinder());
				break;
			case 5:
				System.out.println("Об'єм піраміди: " + pyramid());
				break;
			case 6:
				System.out.println("Об'єм зрізаної піраміди: " + cutpyramid());
				break;
			case 7:
				System.out.println("Об'єм призми: " + prism());
				break;
			default:
				System.out.println("Введено невірне число!");
				break;
			}
		} else if (formulae == 3) {
			System.out.println("Виберіть тіло:" + "\n1. Куля" + "\n2. Конус" + "\n3. Зрізаний конус"
					+ "\n4.Циліндр" + "\n5.Піраміда" + "\n6.Зрізана піраміда" + "\n7.Куб" + "\n8.Паралелепіпед");
			int checksq = sc.nextInt();
			switch (checksq) {
			case 1:
				System.out.println("Площа поверхні кулі: " + sqball());
				break;
			case 2:
				System.out.println("Площа поверхні конуса: " + sqcone());
				break;
			case 3:
				System.out.println("Площа поверхні конуса: " + sqfrustum());
				break;
			case 4:
				System.out.println("Площа поверхні циліндра: " + sqcylinder());
				break;
			case 5:
				System.out.println("Площа поверхні піраміди: " + sqpyramid());
				break;
			case 6:
				System.out.println("Площа поверхні зрізаної піраміди: " + sqcutpyramid());
				break;
			case 7:
				System.out.println("Площа поверхні призми: " + sqcube());
				break;
			case 8:
				System.out.println("Площа поверхні призми: " + sqparallelepiped());
				break;
			default:
				System.out.println("Введено невірне число!");
				break;
			}
		}
			else {
			System.out.println("Введено невірне число!");
		}
	}
	static double circle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введіть довжину радіуса кола r:");
		double r = sc.nextDouble();
		double s = Math.PI * r * r;
		return s;
	}
	static double triangle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введіть довжину сторони трикутника a:");
		double a = sc.nextDouble();
		System.out.print("Введіть довжину висоти трикутника h:");
		double h = sc.nextDouble();
		double s = a * h / 2;
		return s;
	}
	static double rectangle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введіть довжину сторони прямокутника a:");
		double a = sc.nextDouble();
		System.out.print("Введіть довжину сторони прямокутника b:");
		double b = sc.nextDouble();
		double s = a * b;
		return s;
	}
	static double parallelogram() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введіть довжину сторони паралелограма a:");
		double a = sc.nextDouble();
		System.out.print("Введіть довжину висоти паралелограма h:");
		double h = sc.nextDouble();
		double s = a * h;
		return s;
	}
	static double trapeze() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введіть довжину сторони трапеції a:");
		double a = sc.nextDouble();
		System.out.print("Введіть довжину висоти трапеції h:");
		double h = sc.nextDouble();
		double s = a * h;
		return s;
	}
	static double ball(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Введіть довжину радіуса кулі r:");
		double r = sc.nextDouble();
		double v = 4 * Math.PI * r * r * r / 3;
		return v;
	}
	static double cone(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Введіть довжину висоти конуса h:");
		double h = sc.nextDouble();
		double s = circle();
		double v = s * h / 3;
		return v;
	}
	static double frustum(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Введіть довжину висоти зрізаного конуса h:");
		double h = sc.nextDouble();
		System.out.print("Введіть радіус більшої основи зрізаного конуса r1:");
		double r1 = sc.nextDouble();
		System.out.print("Введіть радіус меншої основи зрізаного конуса r2:");
		double r2 = sc.nextDouble();
		double v = Math.PI * h * (r1 * r1 + r1 * r2 + r2 * r2) / 3;
		return v;
	}
	static double cylinder(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Введіть довжину висоти циліндра h:");
		double h = sc.nextDouble();
		double s = circle();
		double v = s * h;
		return v;
	}
	static double pyramid(){
		double s = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Введіть довжину висоти піраміди h:");
		double h = sc.nextDouble();
		System.out.println("Виберіть основу піраміди:"
				+ "\n1.Трикутник"
				+ "\n2.Чотирикутник");
		int check = sc.nextInt();
		if (check == 1) {
			s = triangle();
		} else if (check == 2) {
			s = parallelogram();
		} else {
			System.out.println("Введено невірне число!");
		}
		double v = s * h / 3;
		return v;
	}
	static double cutpyramid(){
		double s1 = 0;
		double s2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Введіть довжину висоти зрізаної піраміди h:");
		double h = sc.nextDouble();
		System.out.println("Виберіть основу зрізаної піраміди:"
				+ "\n1.Трикутник"
				+ "\n2.Чотирикутник");
		int check = sc.nextInt();
		if (check == 1) {
			s1 = triangle();
			s2 = triangle();
		} else if (check == 2) {
			s1 = parallelogram();
			s2 = parallelogram();
		} else {
			System.out.println("Введено невірне число!");
		}
		double v = h * (s1 + Math.sqrt(s1 * s2) + s2) / 3;
		return v;
	}
	static double prism(){
		double s = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Введіть довжину висоти призми h:");
		double h = sc.nextDouble();
		System.out.println("Виберіть основу призми:"
				+ "\n1.Трикутник"
				+ "\n2.Чотирикутник");
		int check = sc.nextInt();
		if (check == 1) {
			s = triangle();
		} else if (check == 2) {
			s = parallelogram();
		} else {
			System.out.println("Введено невірне число!");
		}
		double v = s * h;
		return v;
	}
	static double sqball(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Введіть довжину радіуса кулі r:");
		double r = sc.nextDouble();
		double sq = 4 * Math.PI * r * r;
		return sq;
	}
	static double sqcone(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Введіть довжину радіуса основи r:");
		double r = sc.nextDouble();
		System.out.print("Введіть довжину твірної конуса r:");
		double l = sc.nextDouble();
		double sq = Math.PI * r * (r + l);
		return sq;
	}
	static double sqfrustum(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Введіть довжину висоти зрізаного конуса h:");
		double h = sc.nextDouble();
		System.out.print("Введіть радіус більшої основи зрізаного конуса r1:");
		double r1 = sc.nextDouble();
		System.out.print("Введіть радіус меншої основи зрізаного конуса r2:");
		double r2 = sc.nextDouble();
		double sq = Math.PI * (Math.sqrt(h * h + (r1 - r2) * (r1 - r2)) * (r1 + r2) + r1 * r1 + r2 * r2);
		return sq;
	}
	static double sqcylinder(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Введіть довжину висоти циліндра h:");
		double h = sc.nextDouble();
		System.out.print("Введіть довжину радіуса основи циліндра r:");
		double r = sc.nextDouble();
		double sq = 2 * Math.PI * r * (r + h);
		return sq;
	}
	static double sqpyramid(){
		double s = 0;
		double sb = 0;
		double sq = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Виберіть основу піраміди:"
				+ "\n1.Трикутник"
				+ "\n2.Чотирикутник");
		int check = sc.nextInt();
		if (check == 1) {
			System.out.println("Площа основи:");
			s = triangle();
			System.out.println("Площа бічної сторони:");
			sb = triangle();
			sq = s + sb * 3;
		} else if (check == 2) {
			System.out.println("Площа основи:");
			s = parallelogram();
			System.out.println("Площа бічної сторони:");
			sb = triangle();
			sq = s + sb * 4;
		} else {
			System.out.println("Введено невірне число!");
		}
		return sq;
	}
	static double sqcutpyramid(){
		double s1 = 0;
		double s2 = 0;
		double sb = 0;
		double sq = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Виберіть основу зрізаної піраміди:"
				+ "\n1.Трикутник"
				+ "\n2.Чотирикутник");
		int check = sc.nextInt();
		if (check == 1) {
			System.out.println("Площа більшої основи:");
			s1 = triangle();
			System.out.println("Площа меншої основи:");
			s2 = triangle();
			System.out.println("Площа бічної сторони:");
			sb = trapeze();
			sq = s1 + s2 + sb * 3;
		} else if (check == 2) {
			System.out.println("Площа більшої основи:");
			s1 = parallelogram();
			System.out.println("Площа меншої основи:");
			s2 = parallelogram();
			System.out.println("Площа бічної сторони:");
			sb = trapeze();
			sq = s1 + s2 + sb * 4;
		} else {
			System.out.println("Введено невірне число!");
		}
		return sq;
	}
	static double sqcube(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Введіть довжину сторони куба a:");
		double a = sc.nextDouble();
		double sq = 6 * a * a;
		return sq;
	}
	static double sqparallelepiped(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Введіть довжину довшої сторони паралелепіпеда a:");
		double a = sc.nextDouble();
		System.out.print("Введіть довжину коротшої сторони паралелепіпеда b:");
		double b = sc.nextDouble();
		System.out.print("Введіть довжину висоти паралелепіпеда h:");
		double h = sc.nextDouble();
		double sq = 2 * (a * b + a * h + b * h);
		return sq;
	}
}