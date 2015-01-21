package ca.ets.osgi.hotelservice;

import java.util.Date;

public class hotel {

String nom;
String adresse;
String ville;
String etat;
String pays;
public hotel(String nom, String adresse, String ville, String etat, String pays) {
	super();
	this.nom = nom;
	this.adresse = adresse;
	this.ville = ville;
	this.etat = etat;
	this.pays = pays;
}
public String getNom() {
	return nom;
}
public String getAdresse() {
	return adresse;
}
public String getVille() {
	return ville;
}
public String getEtat() {
	return etat;
}
public String getPays() {
	return pays;
}
public boolean createReservation(Date depart, Date arrivee){
	return true;
}

public String adresseString() {
	return adresse+","+ville+","+etat+","+pays;
}


}
