package MBclean.MBclean;

import java.io.IOException;

import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;
import org.apache.commons.lang.StringUtils;

public class Amenities extends EvalFunc<String>  
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
		String header = "air_conditioning	swimming_pool	lift	power_back_up	service_elevator	quarter_for_domestic_help	parking	security	banquet_hall	club_house	gym	intercom	close_circuit_CCTV_cameras	jogging_track	maintenance_staff	park	tennis_court	piped_gas";
		if(StringUtils.containsIgnoreCase(input, "apartments_amenities"))
			return header;
		else
		{
		
		if(StringUtils.containsIgnoreCase(input, "Air Conditioned"))
			dummies = "1";
		else 
			dummies = "0";
		if(StringUtils.containsIgnoreCase(input, "Swimming Pool"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		if(StringUtils.containsIgnoreCase(input, "Lift"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		if(StringUtils.containsIgnoreCase(input, "Power Back Up"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		if(StringUtils.containsIgnoreCase(input, "Service Elevator"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		if(StringUtils.containsIgnoreCase(input, "Quarter for Domestic Help"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "Reserved Parking"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "Security"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		if(StringUtils.containsIgnoreCase(input, "Banquet Hall"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
				
		if(StringUtils.containsIgnoreCase(input, "Club House"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		if(StringUtils.containsIgnoreCase(input, "Gymnasium"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		if(StringUtils.containsIgnoreCase(input, "Intercom Facility"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		if(StringUtils.containsIgnoreCase(input, "Close Circuit CCTV Cameras"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
			
		if(StringUtils.containsIgnoreCase(input, "Jogging and Strolling Track"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		if(StringUtils.containsIgnoreCase(input, "Maintenance Staff"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "Park"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "Outdoor Tennis Courts"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
			if(StringUtils.containsIgnoreCase(input, "Piped Gas"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
	
		return dummies;
		}
	}

}
