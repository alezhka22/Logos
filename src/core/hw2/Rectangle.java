package core.hw2;

public class Rectangle {
	int a;
	int b;
	Rectangle(int a, int b){
		this.a = a;
		this.b = b;
	}
	void run(){
		System.out.println("�������� s������������ = " + (a + b) * 2);
		System.out.println("����� ������������ = " + (a * b));
	}
}
