package ca.ets.osgi.billetservice;
import java.util.Date;
import java.util.Hashtable;
import java.util.LinkedList;

import javax.json.Json;
import javax.json.JsonObject;

import ca.ets.osgi.billetinterface.IBilletService;


public class BilletService implements IBilletService{
	LinkedList<LiaisonAerienne> listLiaison; 
	public BilletService() {
	
		listLiaison.add(new LiaisonAerienne(1,10,"Montreal","Las Vegas","Montreal Trudeau","Vegas"));
		listLiaison.add(new LiaisonAerienne(3,7,"Montreal","Las Vegas","Montreal Trudeau","Vegas"));
		listLiaison.add(new LiaisonAerienne(8,15,"Montreal","Las Vegas","Montreal Trudeau","Vegas"));
		listLiaison.add(new LiaisonAerienne(5,15,"Montreal","Las Vegas","Montreal Trudeau","Vegas"));
		
	}

	@Override
	public JsonObject getTravelTicket(Date depart, Date arrive,
			String villeDepart, String villeArrivee) {
		// TODO Auto-generated method stub
		LiaisonAerienne liaison=findFlight(depart, arrive,villeDepart, villeArrivee);
		if(liaison==null){		
		JsonObject returnObject = Json.createObjectBuilder()
				  .add("Status", false)				 
				  .build();
		
		return returnObject;
		}
		else{
			JsonObject returnObject = Json.createObjectBuilder()
					  .add("Status", false)
					  .add("AeroportDepart", liaison.getAeroportDepart())
					  .add("AeroportArrive", liaison.getAeroportArrive())
					  .build();
			
			return returnObject;
		}
		
		
	}

	private LiaisonAerienne findFlight(Date depart, Date arrive, String villeDepart,
			String villeArrivee) {
				
		LiaisonAerienne liaisonChoisie=null;
	for (LiaisonAerienne element : listLiaison){
		
		if(element.filghtMatchCriteria(depart, arrive, villeDepart, villeArrivee)){
			liaisonChoisie=element;
		}
	}
	
		return liaisonChoisie;
		
	}

}