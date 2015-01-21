package ca.ets.osgi.cityservice;
import java.util.Hashtable;
import ca.ets.osgi.cityinterface.ICityService;
public class CityService implements ICityService{
Hashtable<String, String> listCities;
public CityService(){
listCities = new Hashtable<String, String>();
listCities.put("Montreal", "CAD");
listCities.put("Newyork", "USD");
listCities.put("Paris", "EUR");
}
@Override
public String getCurrency(String city) {
return listCities.get(city);
}}