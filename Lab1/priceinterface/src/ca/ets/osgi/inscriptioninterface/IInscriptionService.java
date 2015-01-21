package ca.ets.osgi.inscriptioninterface;
import java.util.Date;

import javax.json.*;


public interface IInscriptionService {

	JsonObject  createReservation(String nom,Date debut,Date fin); 
}
