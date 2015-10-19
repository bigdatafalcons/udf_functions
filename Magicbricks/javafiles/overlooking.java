package MBclean.MBclean;

import java.io.IOException;

import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;
import org.apache.commons.lang.StringUtils;

public class overlooking extends EvalFunc<String>  
{

	@Override
	public String exec(Tuple input) throws IOException {
		 if (input == null || input.size() == 0)
		     return null;
		 try{
		     String str = (String)input.get(0);
		     return amenities(str);
		     }
		 catch(Exception e)
		 {
		    	 //String str = (String)input.get(0);
		    	 return null;
		  }
	}

	public String amenities(String input) {
		
		String dummies = null;
		String header = "overlooking_garden_park	overlooking_pool	overlooking_main_road";
		if(StringUtils.containsIgnoreCase(input, "apartments_overlooking"))
			return header;
		else
		{
		
		if(StringUtils.containsIgnoreCase(input, "Garden/Park"))
			dummies = "1";
		else 
			dummies = "0";

		if(StringUtils.containsIgnoreCase(input, "Pool"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		if(StringUtils.containsIgnoreCase(input, "Main Road"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		return dummies;
		}
	}

}
