package ca.ets.osgi.currencyservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import ca.ets.osgi.currencyinterface.ICurrencyService;

public class Activator implements BundleActivator {

	public void start(BundleContext context) throws Exception {
		ICurrencyService service = new CurrencyService();
		context.registerService(ICurrencyService.class.getName(), service, null);
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
