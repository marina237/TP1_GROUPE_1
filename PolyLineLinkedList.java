package fr.dauphine.javaavance.td1;

import java.util.LinkedList;


//LinkedList sont des structures
//de données linéaires 
//où les éléments ne sont
//pas stockés dans des
//emplacements contigus 
//et chaque élément est
//un objet séparé avec 
//une partie de données 
//et une partie d'adresse.
//Les éléments sont liés à 
//l'aide de pointeurs et d'adresses.
//Chaque élément est appelé un nœud.


public class PolyLineLinkedList {
	private LinkedList<Point> listPoints;
	
	public PolyLineLinkedList() {
		listPoints = new LinkedList<Point>();
	}
	
	public void add(Point p) {
		listPoints.add(p);
	}
	
	public int nbPoints() {
		return listPoints.size();
	}
	
	public boolean contains(Point p) {
		return listPoints.contains(p);
	}
}
