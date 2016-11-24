package core.less3;

public class Main {

	public static void main(String[] args) {
		Hunter hunter = new Hunter(18, "Ivan");
		hunter.eatMeat("bird meat");
		hunter.eatMeat();
		Human human = new Human (20, "Petro");
		Collector collector = new Collector(25, "Fedya");
		collector.eatFruit("coco-nut");
	}

}
