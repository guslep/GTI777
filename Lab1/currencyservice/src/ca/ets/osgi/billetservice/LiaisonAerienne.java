package ca.ets.osgi.billetservice;

import java.util.Date;

public class LiaisonAerienne {

	int jourDepart;
	int jourRetour;
	String villeDepart;
	String villeArrive;
	String aeroportDepart;
	String aeroportArrive;
	

	public int getJourDepart() {
		return jourDepart;
	}
	public int getJourRetour() {
		return jourRetour;
	}
	public String getVilleDepart() {
		return villeDepart;
	}
	public String getVilleArrive() {
		return villeArrive;
	}
	
	
	public String getAeroportDepart() {
		return aeroportDepart;
	}
	public String getAeroportArrive() {
		return aeroportArrive;
	}
	public LiaisonAerienne(int jourDepart, int jourRetour, String villeDepart,
			String villeArrive, String aeroportDepart, String aeroportArrive) {
		super();
		this.jourDepart = jourDepart;
		this.jourRetour = jourRetour;
		this.villeDepart = villeDepart;
		this.villeArrive = villeArrive;
		this.aeroportDepart = aeroportDepart;
		this.aeroportArrive = aeroportArrive;
	}
	public Boolean filghtMatchCriteria(Date depart, Date arrive, String villeDepart,String villeArrivee){
		
		Date dateRetourLiaison=new Date(arrive.getTime() + (1000 * 60 * 60 * 24*jourRetour));
	
				
		if (villeDepart==this.villeDepart&&villeArrivee==this.villeArrive&&depart.getDate()==jourDepart&&dateRetourLiaison.getDate()==jourRetour){
			return true;
		}
		return false;
		
		
	}
	
}
