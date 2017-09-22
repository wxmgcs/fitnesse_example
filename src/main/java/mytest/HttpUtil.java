package mytest;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.httpclient.methods.PostMethod;
import org.omg.CORBA.NameValuePair;

public class HttpUtil {

	static NameValuePair parameters;

	public static void setParameters(Map<String, String> params, int num) {
		int i = 0;

		parameters = new NameValuePair(num);

		Entry<String, String> entry;
		for (Iterator<Entry<String, String>> it = params.entrySet().iterator(); it.hasNext();) {
			entry = it.next();
			parameters[i] = new NameValuePair();
			parameters[i].setName(entry.getKey());
			parameters[i].setValue(entry.getValue());
			i++;
		}
	}
	
	static StringBuilder postResponse ;
	public static void doPost(String url){
		
		postResponse = new StringBuilder();
		
		PostMethod method =  new PostMethod(url);
		if(method == null){
			method.addParameters(parameters);
		}
		
	}
	
	
	

}
