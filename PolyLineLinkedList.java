package fr.dauphine.javaavance.td1;

import java.util.LinkedList;


//LinkedList sont des structures
//de donn�es lin�aires 
//o� les �l�ments ne sont
//pas stock�s dans des
//emplacements contigus 
//et chaque �l�ment est
//un objet s�par� avec 
//une partie de donn�es 
//et une partie d'adresse.
//Les �l�ments sont li�s � 
//l'aide de pointeurs et d'adresses.
//Chaque �l�ment est appel� un n�ud.


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
