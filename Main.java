public class Main {
	public static void main(String [] args) {

//--------------------Point--------------------
		Point P = new Point();
		Point P1 = new Point(0, 5);
		Point P2 = new Point(P1);
		if (P1.contains(P2)) {
			System.out.println("P1 contains P2");
		}
		else {
			System.out.println("P1 doesn't contains P2");
		}
		
		P2.setY(P2.getY() + 5);
		if (P1.contains(P2)) {
			System.out.println("P1 contains P2");
		}
		else {
			System.out.println("P1 doesn't contains P2");
		}
		System.out.print("P: " + P + "\n" + "P1: " + P1 + "\n" + 
"P2: " + P2+ "\n");
//--------------------Line---------------------
		Line L1 = new Line(P1, P2);
		double lineLength = L1.getLength();
		System.out.println("Length of L1, which is constructed 
from P1 and P2 is " + lineLength);
		P = new Point(0, 7);
		if (L1.contains(P)) {
			System.out.println("P is on L1");
		}
		else {
			System.out.println("P isn't on L1");
		}
		P = new Point(5, 7);
		if (L1.contains(P)) {
			System.out.println("P is on L1");
		}
		else {
			System.out.println("P isn't on L1");
		}
	}
}
