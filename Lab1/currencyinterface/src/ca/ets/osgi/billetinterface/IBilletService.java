package ca.ets.osgi.billetinterface;
import java.util.Date;
import javax.json.*;
public interface IBilletService {
	JsonObject getTravelTicket(Date depart,Date arrive,String villeDepart,String villeArrivee);
} 