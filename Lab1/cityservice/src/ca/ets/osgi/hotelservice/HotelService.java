package ca.ets.osgi.hotelservice;
import java.util.Date;
import java.util.Hashtable;
import java.util.LinkedList;
import org.json.simple.*;

import ca.ets.osgi.hotelinterface.IHotelService;


public class HotelService implements IHotelService{

LinkedList<hotel> listHotel; 
public HotelService(){
	listHotel = new LinkedList<>();
	listHotel.add(new hotel("ceasar", "124 dunno st", "Las Vegas", "NEVADA", "USA"));
}
@Override
public String createReservation(String nomHotel, JSONObject adresse,
		Date depart, Date arrivee) {
	// TODO Auto-generated method stub
	hotel hotelChoisie=null;
	for(hotel element:listHotel){
		Boolean match=adresse.get("ville")==element.getVille();
		match=match&&adresse.get("etat")==element.getEtat();
		match=match&&adresse.get("pays")==element.getPays();
		if(match){
			hotelChoisie=element;
		}
		
	}
	JSONObject returnObject=new JSONObject();
	 	 
	if(hotelChoisie!=null)
	{
		if(hotelChoisie.createReservation(depart, arrivee)){
			
			  returnObject.put("Status", true);
			  returnObject.put("NomHotel", hotelChoisie.getNom());
			  returnObject.put("Addresse", hotelChoisie.adresseString());				 
			
		}
		else{
			 returnObject.put("Status", false);			
		}
	}
	else{
		 returnObject.put("Status", false);			
	}
	return returnObject.toJSONString();
}


}