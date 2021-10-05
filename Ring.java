package fr.dauphine.javaavance.td1;

public class Ring extends Circle {
	private final int outer_r; //rayon exterieur
	private final Point center;
	
	
	
	
	public Ring() {
		super();
		outer_r = 2;
		this.center = null;
	}
	
	public Ring(Point p, int r1, int r2) {
		super(p,r1);
		if(r1<r2) {
			outer_r = r2;
		}
		else {
			throw new IllegalArgumentException("r1 must be smaller than r2");
		}
		this.center = p;
	}
	

	public int getR2() {
		return outer_r;
	}
	
	public boolean contains(Point p) {
		return new Circle(this.getCenter(),outer_r).contains(p);
	}
	
	private Point getCenter() {
		// TODO Auto-generated method stub
		return center;
	}

	public boolean contains(Point p, Ring[] rings) {
		for(Ring r : rings) {
			if(r.contains(p)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj)) return false;
		if(this==obj) return true;
		if(!(obj instanceof Ring)) return false;
		Ring r = (Ring) obj;
		return r.getR2()== outer_r;
	}
	
	@Override
	public String toString() {
		return super.toString() + " (outer_r=" + outer_r + ")";
	}
	

}
