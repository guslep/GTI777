package ca.ets.osgi.hotelservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import ca.ets.osgi.hotelinterface.IHotelService;;

public class Activator implements BundleActivator {

	public void start(BundleContext context) throws Exception {
		IHotelService service = new HotelService();
		context.registerService(IHotelService.class.getName(), service, null);
		System.out.println("ICity is registered");
		
		}
		public void stop(BundleContext context) throws Exception {
		}
		private static BundleContext context;

		static BundleContext getContext() {
			return context;
		}


}
