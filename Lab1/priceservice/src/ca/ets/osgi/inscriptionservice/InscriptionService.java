package ca.ets.osgi.inscriptionservice;


import java.util.Date;
import java.util.Hashtable;

import ca.ets.osgi.inscriptioninterface.IInscriptionService;
import javax.json.*;

import java.awt.List;
import java.lang.Double;;
public class InscriptionService implements IInscriptionService{
Hashtable<String, Evenement> listEvenement;
public InscriptionService(){
	listEvenement = new Hashtable<String, Evenement>();
	listEvenement.put("Celine Dion", new Evenement("Celine Dion", "Ceasar Palace","Las Vegas","NEVADA","USA"));
	listEvenement.put("CsGame", new Evenement("CsGame","ETS","Montreal","QUEBEC","CANADA"));
	listEvenement.put("Olympique", new Evenement("Conference Olympique","456 rue Rio","Rio de Janeiro","RIO STATE","BRAZIL"));
}
@Override
public JsonObject createReservation(String nom, Date debut, Date fin) {
	// TODO Auto-generated method stub
	
	JsonObject returnObject = Json.createObjectBuilder()
			  .add("Status", true)
			  .add("Adresse", (listEvenement.get(nom)).getAddress())
			   .add("Ville", (listEvenement.get(nom)).getVille())
			    .add("Etat", (listEvenement.get(nom)).getEtat())
			     .add("Pays", (listEvenement.get(nom)).getPays())
			  .build();
	
	return returnObject;
}


}