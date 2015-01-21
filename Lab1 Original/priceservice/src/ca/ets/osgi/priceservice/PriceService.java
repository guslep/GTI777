package ca.ets.osgi.priceservice;

import java.util.Hashtable;
import ca.ets.osgi.priceinterface.IPriceService;
import java.lang.Double;;
public class PriceService implements IPriceService{
Hashtable<String, Double> listItems;
public PriceService(){
listItems = new Hashtable<String, Double>();
listItems.put("laptop-1", 500.00);
listItems.put("laptop-2", 700.00);
listItems.put("laptop-3", 1000.00);
}
@Override
public Double getPrice(String item) {
return listItems.get(item);
} }