package fr.dauphine.javaavance.td1;

import java.util.*;



public class PolyLine {
	
	private Point[] liste; // PolyLine = liste de Points de la classe Point 
	

	//Polymorphisme
	public PolyLine(int n) {
		
		this.liste = new Point[n];
	}

	
	public PolyLine() {
		
		this.liste = new Point[2];
	}
	

	 public void add(Point p) {
		 for (int i = 0; i < liste.length; i++) {
			if (liste[i].equals(null)) {
				liste[i] = p;
				break;
			}
		} 
	 }
	 
	 public int pointCapacity() {
			return liste.length;
		}

	 
		public int nbPoints() {
			int counter = 0;
			for(int i = 0; i< liste.length; i++) {
				if(liste[i] != null ){
					counter++;
				}
			}
			return counter;
		}
	 
	 
	 
	 public boolean polyLineContains(Point b) {
		 for (Point p : liste) {
			 if(b.equals(p)) {
					return true;
				}
		}
		 return false;
		 	
		}
	 



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creation liste
		Point[] test = new Point[3];
		
		PolyLine pl1 = new PolyLine();
		
		
		pl1.add(null);
		
		Point pa = new Point(2,5);
		Point pb = new Point(2,4);
		
		
		System.out.println(pl1.pointCapacity());
		
		
		
	
	}

}
