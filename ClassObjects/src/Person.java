
public class Person {

	String name;
	int numStickers;
	
	public void reveive(int numStickers) {
		
//		this.numStickers = this.numStickers + numStickers;
		this.numStickers += numStickers;
	}
	
	public void give(int numStickers, Person p) {
		
		this.numStickers -= numStickers;
//		p.numStickers += numStickers;
		p.reveive(numStickers);
	}
}
