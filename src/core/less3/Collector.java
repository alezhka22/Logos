package core.less3;

import java.util.Random;

public class Collector extends Human {
	
int collectedFruits;
	
	public Collector(int age, String name){
		super(age, name);
	}
	
	void eatFruits(String fruit){
		System.out.println(name+": mmm nyam-nyam "+fruit);
	}
	
	void eatFruit(String fruit){
		run();
		for (int i = 0; i < 5; i++) {
			collectedFruits += (int) Math.round(Math.random());
		}
		if(collectedFruits == 5){
			System.out.println(name + ": I have collected " + collectedFruits + " fruits");
			eatFruits(fruit);
		} else {
			System.out.println("Not enough fruits");
		}
	}
	
	@Override
	void run(){
		System.out.println(name+": slower go-go-go");
	}
	@Override
	public String toString(){
		return "Collector [age="+age+",name="+name+", collected fruits=" + collectedFruits + "]";
	}
	
}
