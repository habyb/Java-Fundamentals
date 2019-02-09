
public class Main {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "John";
		
		Person p2 = new Person();
		p2.name = "Mary";
				
		p1.reveive(5);
		p1.reveive(7);
		
		// John gave 2 stickers to Mary
		p1.give(2, p2);
		
		// Mary gave 1 sticker to John
		p2.give(1, p1);
		
		System.out.println(p1.name + " => " + p1.numStickers);
		System.out.println(p2.name + " => " + p2.numStickers);
		
	}

}
