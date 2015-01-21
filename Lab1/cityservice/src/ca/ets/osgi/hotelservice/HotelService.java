package ca.ets.osgi.hotelservice;
import java.util.Hashtable;

import ca.ets.osgi.hotelinterface.IHotelService;;
public class HotelService implements IHotelService{
Hashtable<String, String> listCities;
public HotelService(){
listCities = new Hashtable<String, String>();
listCities.put("Montreal", "CAD");
listCities.put("Newyork", "USD");
listCities.put("Paris", "EUR");
}
@Override
public String getCurrency(String city) {
return listCities.get(city);
}}