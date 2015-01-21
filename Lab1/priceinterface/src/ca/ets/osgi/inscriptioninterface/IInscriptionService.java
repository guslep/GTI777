package ca.ets.osgi.inscriptioninterface;
import java.util.Date;




public interface IInscriptionService {

	String  createReservation(String nom,Date debut,Date fin); 
}
