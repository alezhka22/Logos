package core.less2;
//Data Transfer Object - ��� ����������� ���� �����
public class Person {
	
	int age;
	
	String name;
	
	Person(int age, String name){
		this.age = age;
		this.name = name;
	}
	void run(){
		System.out.println(name+": go-go-go");
	}
	
	
}
