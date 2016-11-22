package core.hw2;
//Data Transfer Object - д«ї рі§­оё®р±ІЁпїЅпїЅдіў д ­иµЌ
public class Rectangle {
	int a;
	int b;
	Rectangle(int a, int b){
		this.a = a;
		this.b = b;
	}
	void run(){
		System.out.println("Периметр прямокутника = " + ((a + b) * 2));
		System.out.println("Площа прямокутника = " + (a * b));
	}
	
	
}
