package basics.hw3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� �������� ��� ������ ���������:"
				+ "\n1. ����� ������" + "\n2. ��'�� ���" + "\n3.����� ������� ���");
		int formulae = sc.nextInt();
		if (formulae == 1) {
			System.out.println("������� ������:" + "\n1.����"
					+ "\n2.���������" + "\n3.�����������" + "\n4.������������"
					+ "\n5.��������");
			int checks = sc.nextInt();
			switch (checks) {
			case 1:
				System.out.println("����� �����: " + circle());
				break;
			case 2:
				System.out.println("����� ����������: " + triangle());
				break;
			case 3:
				System.out.println("����� ������������: " + rectangle());
				break;
			case 4:
				System.out.println("����� �������������: " + parallelogram());
				break;
			case 5:
				System.out.println("����� ��������: " + trapeze());
				break;
			default:
				System.out.println("������� ������ �����!");
			}
		} else if (formulae == 2) {
			System.out.println("������� ���:" + "\n1.����" + "\n2.�����" + "\n3.������� �����"
					+ "\n4.������" + "\n5.ϳ�����" + "\n6.������ ������" + "\n7.������");
			int checkv = sc.nextInt();
			switch (checkv) {
			case 1:
				System.out.println("��'�� ���: " + ball());
				break;
			case 2:
				System.out.println("��'�� ������: " + cone());
				break;
			case 3:
				System.out.println("��'�� �������� ������: " + frustum());
				break;
			case 4:
				System.out.println("��'�� �������: " + cylinder());
				break;
			case 5:
				System.out.println("��'�� ������: " + pyramid());
				break;
			case 6:
				System.out.println("��'�� ������ ������: " + cutpyramid());
				break;
			case 7:
				System.out.println("��'�� ������: " + prism());
				break;
			default:
				System.out.println("������� ������ �����!");
				break;
			}
		} else if (formulae == 3) {
			System.out.println("������� ���:" + "\n1. ����" + "\n2. �����" + "\n3. ������� �����"
					+ "\n4.������" + "\n5.ϳ�����" + "\n6.������ ������" + "\n7.���" + "\n8.������������");
			int checksq = sc.nextInt();
			switch (checksq) {
			case 1:
				System.out.println("����� ������� ���: " + sqball());
				break;
			case 2:
				System.out.println("����� ������� ������: " + sqcone());
				break;
			case 3:
				System.out.println("����� ������� ������: " + sqfrustum());
				break;
			case 4:
				System.out.println("����� ������� �������: " + sqcylinder());
				break;
			case 5:
				System.out.println("����� ������� ������: " + sqpyramid());
				break;
			case 6:
				System.out.println("����� ������� ������ ������: " + sqcutpyramid());
				break;
			case 7:
				System.out.println("����� ������� ������: " + sqcube());
				break;
			case 8:
				System.out.println("����� ������� ������: " + sqparallelepiped());
				break;
			default:
				System.out.println("������� ������ �����!");
				break;
			}
		}
			else {
			System.out.println("������� ������ �����!");
		}
	}
	static double circle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������� ������ ���� r:");
		double r = sc.nextDouble();
		double s = Math.PI * r * r;
		return s;
	}
	static double triangle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������� ������� ���������� a:");
		double a = sc.nextDouble();
		System.out.print("������ ������� ������ ���������� h:");
		double h = sc.nextDouble();
		double s = a * h / 2;
		return s;
	}
	static double rectangle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������� ������� ������������ a:");
		double a = sc.nextDouble();
		System.out.print("������ ������� ������� ������������ b:");
		double b = sc.nextDouble();
		double s = a * b;
		return s;
	}
	static double parallelogram() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������� ������� ������������� a:");
		double a = sc.nextDouble();
		System.out.print("������ ������� ������ ������������� h:");
		double h = sc.nextDouble();
		double s = a * h;
		return s;
	}
	static double trapeze() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������� ������� �������� a:");
		double a = sc.nextDouble();
		System.out.print("������ ������� ������ �������� h:");
		double h = sc.nextDouble();
		double s = a * h;
		return s;
	}
	static double ball(){
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������� ������ ��� r:");
		double r = sc.nextDouble();
		double v = 4 * Math.PI * r * r * r / 3;
		return v;
	}
	static double cone(){
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������� ������ ������ h:");
		double h = sc.nextDouble();
		double s = circle();
		double v = s * h / 3;
		return v;
	}
	static double frustum(){
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������� ������ �������� ������ h:");
		double h = sc.nextDouble();
		System.out.print("������ ����� ����� ������ �������� ������ r1:");
		double r1 = sc.nextDouble();
		System.out.print("������ ����� ����� ������ �������� ������ r2:");
		double r2 = sc.nextDouble();
		double v = Math.PI * h * (r1 * r1 + r1 * r2 + r2 * r2) / 3;
		return v;
	}
	static double cylinder(){
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������� ������ ������� h:");
		double h = sc.nextDouble();
		double s = circle();
		double v = s * h;
		return v;
	}
	static double pyramid(){
		double s = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������� ������ ������ h:");
		double h = sc.nextDouble();
		System.out.println("������� ������ ������:"
				+ "\n1.���������"
				+ "\n2.������������");
		int check = sc.nextInt();
		if (check == 1) {
			s = triangle();
		} else if (check == 2) {
			s = parallelogram();
		} else {
			System.out.println("������� ������ �����!");
		}
		double v = s * h / 3;
		return v;
	}
	static double cutpyramid(){
		double s1 = 0;
		double s2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������� ������ ������ ������ h:");
		double h = sc.nextDouble();
		System.out.println("������� ������ ������ ������:"
				+ "\n1.���������"
				+ "\n2.������������");
		int check = sc.nextInt();
		if (check == 1) {
			s1 = triangle();
			s2 = triangle();
		} else if (check == 2) {
			s1 = parallelogram();
			s2 = parallelogram();
		} else {
			System.out.println("������� ������ �����!");
		}
		double v = h * (s1 + Math.sqrt(s1 * s2) + s2) / 3;
		return v;
	}
	static double prism(){
		double s = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������� ������ ������ h:");
		double h = sc.nextDouble();
		System.out.println("������� ������ ������:"
				+ "\n1.���������"
				+ "\n2.������������");
		int check = sc.nextInt();
		if (check == 1) {
			s = triangle();
		} else if (check == 2) {
			s = parallelogram();
		} else {
			System.out.println("������� ������ �����!");
		}
		double v = s * h;
		return v;
	}
	static double sqball(){
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������� ������ ��� r:");
		double r = sc.nextDouble();
		double sq = 4 * Math.PI * r * r;
		return sq;
	}
	static double sqcone(){
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������� ������ ������ r:");
		double r = sc.nextDouble();
		System.out.print("������ ������� ����� ������ r:");
		double l = sc.nextDouble();
		double sq = Math.PI * r * (r + l);
		return sq;
	}
	static double sqfrustum(){
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������� ������ �������� ������ h:");
		double h = sc.nextDouble();
		System.out.print("������ ����� ����� ������ �������� ������ r1:");
		double r1 = sc.nextDouble();
		System.out.print("������ ����� ����� ������ �������� ������ r2:");
		double r2 = sc.nextDouble();
		double sq = Math.PI * (Math.sqrt(h * h + (r1 - r2) * (r1 - r2)) * (r1 + r2) + r1 * r1 + r2 * r2);
		return sq;
	}
	static double sqcylinder(){
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������� ������ ������� h:");
		double h = sc.nextDouble();
		System.out.print("������ ������� ������ ������ ������� r:");
		double r = sc.nextDouble();
		double sq = 2 * Math.PI * r * (r + h);
		return sq;
	}
	static double sqpyramid(){
		double s = 0;
		double sb = 0;
		double sq = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ ������:"
				+ "\n1.���������"
				+ "\n2.������������");
		int check = sc.nextInt();
		if (check == 1) {
			System.out.println("����� ������:");
			s = triangle();
			System.out.println("����� ���� �������:");
			sb = triangle();
			sq = s + sb * 3;
		} else if (check == 2) {
			System.out.println("����� ������:");
			s = parallelogram();
			System.out.println("����� ���� �������:");
			sb = triangle();
			sq = s + sb * 4;
		} else {
			System.out.println("������� ������ �����!");
		}
		return sq;
	}
	static double sqcutpyramid(){
		double s1 = 0;
		double s2 = 0;
		double sb = 0;
		double sq = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ ������ ������:"
				+ "\n1.���������"
				+ "\n2.������������");
		int check = sc.nextInt();
		if (check == 1) {
			System.out.println("����� ����� ������:");
			s1 = triangle();
			System.out.println("����� ����� ������:");
			s2 = triangle();
			System.out.println("����� ���� �������:");
			sb = trapeze();
			sq = s1 + s2 + sb * 3;
		} else if (check == 2) {
			System.out.println("����� ����� ������:");
			s1 = parallelogram();
			System.out.println("����� ����� ������:");
			s2 = parallelogram();
			System.out.println("����� ���� �������:");
			sb = trapeze();
			sq = s1 + s2 + sb * 4;
		} else {
			System.out.println("������� ������ �����!");
		}
		return sq;
	}
	static double sqcube(){
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������� ������� ���� a:");
		double a = sc.nextDouble();
		double sq = 6 * a * a;
		return sq;
	}
	static double sqparallelepiped(){
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������� ����� ������� ������������� a:");
		double a = sc.nextDouble();
		System.out.print("������ ������� ������� ������� ������������� b:");
		double b = sc.nextDouble();
		System.out.print("������ ������� ������ ������������� h:");
		double h = sc.nextDouble();
		double sq = 2 * (a * b + a * h + b * h);
		return sq;
	}
}