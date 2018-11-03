public class Point {
	
	Point() {
		x = 0;
		y = 0;
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	Point(Point other) {
		this(other.x, other.y);
	}

	private int x, y;
	
	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	void setX(int x) {
		this.x = x;
	}

	void setY(int y) {
		this.y = y;
	}

	byte getArea(){
		return 0;
	}

	byte getPerimeter() {
		return 0;
	}

	boolean contains(Point p) {
		return this.x == p.x && this.y == p.y;
	}
}
