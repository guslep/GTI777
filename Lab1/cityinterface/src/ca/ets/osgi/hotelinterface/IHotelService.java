package ca.ets.osgi.hotelinterface;

import java.util.Date;
import org.json.simple.*;
public interface IHotelService {
	String createReservation(String nomHotel,JSONObject adresse,Date depart,Date arrivee);
}