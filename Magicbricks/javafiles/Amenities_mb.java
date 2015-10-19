package MBclean.MBclean;

import java.io.IOException;

import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;
import org.apache.commons.lang.StringUtils;

public class Amenities_mb extends EvalFunc<String>  
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
		String header = "air_conditioned	banquet_hall	bar_lounge	cafeteria_food court	club_house	conference_room	dth_television_facility	gymnasium	intercom_facility	internet_wifi_connectivity	jogging_strolling_track	laundry_service	service_goods_lift	maintenance_staff	outdoor_tennis_courts	park	piped_gas	power_back_up	private_terrace_garden	ro_water_system	rain_water_harvesting	reserved_parking	security	lift	swimming_pool	vaastu_compliant	visitor_parking	waste_disposal	water_storage	ceramic_tiles_marble	cooperative_society	marble	mosaic	new_construction	vitrified";
		if(StringUtils.containsIgnoreCase(input, "apartments_amenities"))
			return header;
		else
		{
		
		if(StringUtils.containsIgnoreCase(input, "Air Conditioned"))
			dummies = "1";
		else 
			dummies = "0";
		
		if(StringUtils.containsIgnoreCase(input, "Banquet Hall"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		
		if(StringUtils.containsIgnoreCase(input, "Bar/Lounge"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "Cafeteria/Food Court"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "Club House"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "Conference Room"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "DTH Television Facility"))
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
		
		if(StringUtils.containsIgnoreCase(input, "Internet/Wi-Fi Connectivity"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "Jogging and Strolling Track"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "Laundry Service"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		
		if(StringUtils.containsIgnoreCase(input, "Service/Goods Lift"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "Maintenance Staff"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "Outdoor Tennis Courts"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "Park"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "Piped Gas"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		
		if(StringUtils.containsIgnoreCase(input, "Power Back Up"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "Private Terrace/Garden"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "RO Water System"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "Rain Water Harvesting"))
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
		
		if(StringUtils.containsIgnoreCase(input, "Lift"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "Swimming Pool"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "Vaastu Compliant"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "Visitor Parking"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "Waste Disposal"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "Water Storage"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "Ceramic Tiles, Marble"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "Co-operative Society"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "Marble"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "Mosaic"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "New Construction"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "Vitrified"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
				
			
		return dummies;
		}
	}

}
