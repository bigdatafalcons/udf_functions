package MBclean.MBclean;

/*	------------------------------------------------------------------------------------------------------------------
 *  Author 	: Trishi Khanna
 *  Date 	: 17 OCT 2015
 *  ------------------------------------------------------------------------------------------------------------------
 *  UDF for populating the "Locality" field 
 *  ------------------------------------------------------------------------------------------------------------------
 */ 

import java.io.IOException;

import org.apache.commons.lang.StringUtils;
import org.apache.pig.EvalFunc; 
import org.apache.pig.data.Tuple;
//import org.apache.commons.lang3.StringUtils;

public class MB_Fetch_Locality_City extends EvalFunc<String> {
	
	
	public String detectCity(String input_locality)
	{
				
		if (StringUtils.containsIgnoreCase(input_locality, "Faridabad"))
			return "Faridabad";
		
		else if (StringUtils.containsIgnoreCase(input_locality, "Gurgaon"))
			return "Gurgaon";
		
		else if (StringUtils.containsIgnoreCase(input_locality, "Greater Noida"))
			return "Greater Noida";
		
		else if (StringUtils.containsIgnoreCase(input_locality, "Noida"))
			return "Noida";
		
		else if (StringUtils.containsIgnoreCase(input_locality, "Ghaziabad"))
			return "Ghaziabad";
		
		else if (StringUtils.containsIgnoreCase(input_locality, "New Delhi"))
			return "New Delhi";
		
		
		else 
			return null;
				
	}
	
	@Override
	public String exec(Tuple input)  throws IOException {
		
		if (input == null || input.size() == 0)
		     return null;
		 try{
		     String str = (String)input.get(0);
		     return detectCity(str);
		     }
		 catch(Exception e)
		 {
		    	 //String str = (String)input.get(0);
		    	 return null;
		 }
	}

}

