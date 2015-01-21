package ca.ets.osgi.inscriptionservice;

public class Evenement {
private String name;
private String address;
private String etat;
private String pays;
private String ville;
public Object JsonObject;
public Evenement(String name, String address, String ville ,String etat, String pays) {
	super();
	this.name = name;
	this.address = address;
	this.etat = etat;
	this.pays = pays;
	this.ville=ville;
}
public String getName() {
	return name;
}
public String getAddress() {
	return address;
}
public String getEtat() {
	return etat;
}
public String getPays() {
	return pays;
}
public String getVille() {
	return ville;
}

}
