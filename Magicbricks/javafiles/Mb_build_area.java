package MBclean.MBclean;

import java.io.IOException;

import org.apache.pig.EvalFunc; 
import org.apache.pig.data.Tuple;

public class Mb_build_area extends EvalFunc<String>{
	
	public String floor_number(String input) {
		
		if(input.contains(","))
		{
			String[] apartments_area_detail = null;
			String[] split_str = input.split(",");
			String build_area = null; 
			for( int i = 0 ; i < split_str.length ; i++)
			{
				 
				if(split_str[i].contains("covered"))
				{
					split_str[i] = split_str[i].replaceFirst("^,", "");
					split_str[i] = split_str[i].replace("(","");
					split_str[i] = split_str[i].replace(")","");
					apartments_area_detail = split_str[i].split("covered");
					build_area = apartments_area_detail[0].trim();
					//total_floors = floor_details[1].trim();
				}
				
			}
			return (build_area);
		}
		
		else
		{
			String[] apartments_area_detail = null;
			String[] split_str = input.split(",");
			String build_area = null; 
			for( int i = 0 ; i < split_str.length ; i++)
			{
				 
				if(split_str[i].contains("covered"))
				{
					split_str[i] = split_str[i].replace("(","");
					split_str[i] = split_str[i].replace(")","");
					apartments_area_detail = split_str[i].split("covered");
					build_area = apartments_area_detail[0].trim();
					
				}
				
			}
			return (build_area);
		}
	}
	
	
	
	@Override
	public String exec(Tuple input) throws IOException 
	{
		 if (input == null || input.size() == 0)
		     return ("null	");
		 try{
		     String str = (String)input.get(0);
		     return floor_number(str);
		     }
		 catch(Exception e)
		 {
		    	 //String str = (String)input.get(0);
		    	 return null;
		  }
	}

	

}
