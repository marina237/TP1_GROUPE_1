package fr.dauphine.javaavance.td1;

public class Circle {
	
	private final Point center;
	private final int radius;

	public Circle() {
		// TODO Auto-generated constructor stub
		center = new Point(1,1);
		radius = 1;
	}

	/**
	 * @param center
	 * @param radius
	 */
	public Circle(Point center, int radius) {
	
		this.center = center;
		this.radius = radius;
	
		
	}
	
	public Circle translate(int dx, int dy) {
		return new Circle(center.translate(dx, dy),radius);
	}

	public String toString() {
		return "[center=" + center.toString() + " radius=" + radius + " Area=" + "this.toString()" + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p=new Point(1,2);
		Circle c=new Circle(p,1);
		Circle c2=new Circle(p,2);
		c2.translate(1,1);
		System.out.println(c+" "+c2);

	}

	public boolean contains(Point p) {
		// TODO Auto-generated method stub
		return false;
	}

}
