package ca.ets.osgi.billetservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import ca.ets.osgi.billetinterface.IBilletService;

public class Activator implements BundleActivator {

	public void start(BundleContext context) throws Exception {
		IBilletService service = new BilletService();
		context.registerService(IBilletService.class.getName(), service, null);
		System.out.println("ICurrency is registered");
		this.context=context;
		}
		public void stop(BundleContext context) throws Exception {
		}
		
		private static BundleContext context;

		static BundleContext getContext() {
			return context;
		}


}
