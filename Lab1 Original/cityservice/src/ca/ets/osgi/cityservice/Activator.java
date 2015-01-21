package ca.ets.osgi.cityservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import ca.ets.osgi.cityinterface.ICityService;

public class Activator implements BundleActivator {

	public void start(BundleContext context) throws Exception {
		ICityService service = new CityService();
		context.registerService(ICityService.class.getName(), service, null);
		System.out.println("ICity is registered");
		
		}
		public void stop(BundleContext context) throws Exception {
		}
		private static BundleContext context;

		static BundleContext getContext() {
			return context;
		}


}
