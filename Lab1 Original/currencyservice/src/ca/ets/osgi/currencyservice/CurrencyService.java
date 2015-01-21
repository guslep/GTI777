package ca.ets.osgi.currencyservice;
import java.util.LinkedList;
import ca.ets.osgi.currencyinterface.ICurrencyService;
public class CurrencyService implements ICurrencyService{
LinkedList<CurrencyRate> ratesList;
public CurrencyService(){
ratesList = new LinkedList<CurrencyRate>();
CurrencyRate r1 = new CurrencyRate("CAD","USD",0.95);
CurrencyRate r2 = new CurrencyRate("CAD","EUR",0.75);
CurrencyRate r3 = new CurrencyRate("CAD","CAD",1.00);
ratesList.add(r1);
ratesList.add(r2);
ratesList.add(r3);
}
@Override
public Double convert(String src, String dst, Double price) {
for (CurrencyRate r: ratesList){
if (r.isEqual(src,dst))
return r.convert(price);
} return 0.00;
}}

class CurrencyRate{
String srcCurrency;
String dstCurrency;
double rate;
public CurrencyRate(String src, String dst, double r){
this.srcCurrency = src;
this.dstCurrency =dst;
this.rate = r;
}
public boolean isEqual(String src,String dst){
return ((dst!=null)&& (dst.equalsIgnoreCase(this.dstCurrency))
&& (src!=null)&& (src.equalsIgnoreCase(this.srcCurrency)));
}
public Double convert(Double price){
return price*rate;
}
}