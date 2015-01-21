package ca.ets.osgicomposedservice;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import ca.ets.osgi.billetinterface.IBilletService;
import ca.ets.osgi.hotelinterface.IHotelService;
import ca.ets.osgi.inscriptioninterface.IInscriptionService;;

public class Activator implements BundleActivator {
private BundleContext context;
private IInscriptionService service1;

private IBilletService service2;
private IHotelService service3;
public void start(BundleContext context) throws Exception {
this.context = context;
// Register directly with the service
ServiceReference reference1 = context.getServiceReference(IInscriptionService.class.getName());
ServiceReference reference2 = context.getServiceReference(IBilletService.class.getName());
ServiceReference reference3 = context.getServiceReference(IHotelService.class.getName());
service1 = (IInscriptionService) context.getService(reference1);
service2 = (IBilletService) context.getService(reference2);
service3 = (IHotelService) context.getService(reference3);
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