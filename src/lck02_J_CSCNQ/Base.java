package lck02_J_CSCNQ;

import java.text.DateFormat;
import java.util.Date;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

class Base {
	static DateFormat format =DateFormat.getDateInstance(DateFormat.MEDIUM);
	
	public Date parse(String str) throws ParseException, java.text.ParseException { 
		synchronized (Base.class) {
			return format.parse(str); 
			}
	} 
	
}