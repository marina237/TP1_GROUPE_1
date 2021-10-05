package fr.dauphine.javaavance.td1;

import java.util.ArrayList;

public class Point {
	
	//Attributs du point :
	private int id=1;
	private int x;
	private int y;

	//Creation of variable count
	private static int count=0;

	/**
	 * @param  
	 * @param x
	 * @param y
	 */
	public Point(int x,int y) {
	
		
		this.x = x;
		this.y = y;
		
		
		//increment value count when we create new object
		count++;
	}
	
	
	public Point(Point p2) {
		
			
			this.x = p2.x;
			this.y = p2.y;
			
			
			//increment value count when we create new object
			count++;
		}
	
	
	//Un getter permet l'accès en lecture à un attribut privé : via le "public"
	public int getX() {
		return x;
	}

	//setter permet de demander un changement d'état. (ie changement de valeur)
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	public  String point() {
	
		return "Point coordinates are :"+ "("+ getX() + " , " + getY() + ")";	
	}
	
	 public boolean isSameAs(Object o) { 
		 //Est ce que les obj sont du meme type ?
		 if( !(o instanceof Point)) return false ;
		 Point p = (Point)o ; //cast safe
		 //Si c'est le cas, alors on peut comparer leurs champs
		 return x==p.x && y==p.y ;
		 }
	 
	 //Override la méthode equals pour comparer les attributs de deux objets
	 public boolean equals(Object o) {
		  if (o instanceof Point) {
		    //id comparison
		    Point p = (Point)o;
		    return x==p.x && y==p.y ;
		  }
		  return false;
		}
	 //Override aussi le hashCode selon la JavaCode
	 public int hashCode() {
		    return java.util.Objects.hashCode(id);
		}
	 
	 
	 
	 public Point translate(int dx, int dy) {
			return new Point(dx+x, dy+y);
		}
	 
	 
	 
	 
	 
	 
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x =5;
		int y = 7;
		
		Point p=new Point(x,y);

		
		
		
		System.out.println(p.getX()+" "+p.getY()+"Nb of obj created : "+ Point.count);
	
		System.out.println(p.point());
		
		
		 Point p1=new Point(1,2);
		 Point p2=p1;
		 Point p3=new Point(1,2);
		 //System.out.println(p1==p2);
		 //System.out.println(p1==p3);
		 
		 System.out.println(p2.isSameAs(p3));
		 
		 
		 ArrayList<Point> list = new ArrayList<>();
		 list.add(p1);
		 System.out.println(list.indexOf(p2));
		 System.out.println(list.indexOf(p3));

	}



}
