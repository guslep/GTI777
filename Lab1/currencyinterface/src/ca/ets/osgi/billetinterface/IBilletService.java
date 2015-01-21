package ca.ets.osgi.billetinterface;
import java.util.Date;

public interface IBilletService {
	String getTravelTicket(Date depart,Date arrive,String villeDepart,String villeArrivee);
} 