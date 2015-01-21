package ca.ets.osgi.inscriptionservice;
import org.json.simple.JSONObject;

import java.util.Date;
import java.util.Hashtable;

import ca.ets.osgi.inscriptioninterface.IInscriptionService;


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
public String createReservation(String nom, Date debut, Date fin) {
	// TODO Auto-generated method stub
	
	JSONObject  returnObject = new JSONObject();
			  returnObject.put("Status", true);
			  returnObject.put("Adresse", (listEvenement.get(nom)).getAddress());
			   returnObject.put("Ville", (listEvenement.get(nom)).getVille());
			    returnObject.put("Etat", (listEvenement.get(nom)).getEtat());
			     returnObject.put("Pays", (listEvenement.get(nom)).getPays());
		

	return returnObject.toJSONString();
}


}