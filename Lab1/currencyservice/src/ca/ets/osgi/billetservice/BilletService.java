package ca.ets.osgi.billetservice;
import java.util.Date;
import java.util.Hashtable;
import java.util.LinkedList;

import org.json.simple.*;


import ca.ets.osgi.billetinterface.IBilletService;


public class BilletService implements IBilletService{
	LinkedList<LiaisonAerienne> listLiaison=new LinkedList<>(); 
	public BilletService() {
	
		listLiaison.add(new LiaisonAerienne(1,10,"Montreal","Las Vegas","Montreal Trudeau","Vegas"));
		listLiaison.add(new LiaisonAerienne(3,7,"Montreal","Las Vegas","Montreal Trudeau","Vegas"));
		listLiaison.add(new LiaisonAerienne(8,15,"Montreal","Las Vegas","Montreal Trudeau","Vegas"));
		listLiaison.add(new LiaisonAerienne(5,15,"Montreal","Las Vegas","Montreal Trudeau","Vegas"));
		
	}

	@Override
	public String getTravelTicket(Date depart, Date arrive,
			String villeDepart, String villeArrivee) {
		// TODO Auto-generated method stub
		LiaisonAerienne liaison=findFlight(depart, arrive,villeDepart, villeArrivee);
		JSONObject returnObject=new JSONObject();
		if(liaison==null){		
	
				  returnObject.put("Status", false);				 
				
	
		}
		else{
			
			 returnObject.put("Status", true);
					   returnObject.put("AeroportDepart", liaison.getAeroportDepart());
					   returnObject.put("AeroportArrive", liaison.getAeroportArrive());
					  
			}
		
		return returnObject.toJSONString();
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