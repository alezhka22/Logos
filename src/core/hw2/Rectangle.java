package core.hw2;
//Data Transfer Object - 䫿 𳧭𱲨��䳢 䠭赍
public class Rectangle {
	int a;
	int b;
	Rectangle(int a, int b){
		this.a = a;
		this.b = b;
	}
	void run(){
		System.out.println("�������� ������������ = " + ((a + b) * 2));
		System.out.println("����� ������������ = " + (a * b));
	}
	
	
}
