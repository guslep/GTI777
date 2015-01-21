package ca.ets.osgi.inscriptionservice;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import ca.ets.osgi.inscriptioninterface.IInscriptionService;;

public class Activator implements BundleActivator {
public void start(BundleContext context) throws Exception {
IInscriptionService service = new InscriptionService();
context.registerService(IInscriptionService.class.getName(), service, null);
System.out.println("IPriceService is registered");

}
public void stop(BundleContext context) throws Exception {
}
private static BundleContext context;

static BundleContext getContext() {
	return context;
}

}