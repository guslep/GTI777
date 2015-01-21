package ca.ets.osgi.currencyinterface;

public interface ICurrencyService {
	Double convert(String srcCurrency, String dstCurrency, Double toconvert);
} 