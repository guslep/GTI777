package ca.ets.osgicomposedservice;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import ca.ets.osgi.cityinterface.ICityService;
import ca.ets.osgi.currencyinterface.ICurrencyService;
import ca.ets.osgi.priceinterface.IPriceService;

public class Activator implements BundleActivator {
private BundleContext context;
private IPriceService service1;

private ICurrencyService service2;
private ICityService service3;
public void start(BundleContext context) throws Exception {
this.context = context;
// Register directly with the service
ServiceReference reference1 = context.getServiceReference(IPriceService.class.getName());
ServiceReference reference2 = context.getServiceReference(ICurrencyService.class.getName());
ServiceReference reference3 = context.getServiceReference(ICityService.class.getName());
service1 = (IPriceService) context.getService(reference1);
service2 = (ICurrencyService) context.getService(reference2);
service3 = (ICityService) context.getService(reference3);
startComposedService();
}

private void startComposedService(){
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
String s;
try{
System.out.println("Entrer: iteme,ville ");
while ((s = in.readLine()) != null && s.length() != 0){
String[] str = s.split(",");
Double price1= service1.getPrice(str[0]);
String currency = service3.getCurrency(str[1]);
Double price2= service2.convert("CAD", currency, price1);
System.out.println("Le prix de "+str[0]+" est:"+price2+" "+currency);
System.out.println("Entrer: iteme,ville ");
}
}catch (Exception e){

e.printStackTrace();
}
}
/*
* (non-Javadoc)
* @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
*/
public void stop(BundleContext context) throws Exception {
}
}