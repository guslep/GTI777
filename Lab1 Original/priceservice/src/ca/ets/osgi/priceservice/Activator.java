package ca.ets.osgi.priceservice;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import ca.ets.osgi.priceinterface.IPriceService;

public class Activator implements BundleActivator {
public void start(BundleContext context) throws Exception {
IPriceService service = new PriceService();
context.registerService(IPriceService.class.getName(), service, null);
System.out.println("IPriceService is registered");

}
public void stop(BundleContext context) throws Exception {
}
private static BundleContext context;

static BundleContext getContext() {
	return context;
}

}