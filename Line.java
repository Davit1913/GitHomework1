public class Line {

	Line(Point P1, Point P2) {
		this.P1 = P1;
		this.P2 = P2;
	}

	private Point P1, P2;

	Point getPointP1() {
		return P1;
	}
	
	Point getPointP2() {
		return P2;
	}	
	
	void setPointP1(Point P) {
		P1 = P;
	}
	
	void setPointP2(Point P) {
		P2 = P;
	}
	
	double getLength() {
		return Math.sqrt(Math.pow(P2.getX() - P1.getX(), 2) 
			  + Math.pow(P2.getY() - P1.getY(), 2));
	}

	boolean contains(Point P) {
		return (P.getX()-P1.getX())*(P2.getY()-P1.getY()) == 
		       (P.getY()-P1.getY())*(P2.getX()-P1.getX());
	}
}
