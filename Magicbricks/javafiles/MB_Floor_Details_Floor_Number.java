package MBclean.MBclean;

import java.io.IOException;

import org.apache.pig.EvalFunc; 
import org.apache.pig.data.Tuple;

public class MB_Floor_Details_Floor_Number extends EvalFunc<String>{
	
	public String floor_number(String input) {
		
		if(input.contains(","))
		{
			String[] floor_details = null;
			String[] split_str = input.split(",");
			String floor_number = null, total_floors = null;
			for( int i = 0 ; i < split_str.length ; i++)
			{
				 
				if(split_str[i].contains("Out of"))
				{
					split_str[i] = split_str[i].replace("(","");
					split_str[i] = split_str[i].replace(")","");
					floor_details = split_str[i].split("Out of");
					floor_number = floor_details[0].trim();
					total_floors = floor_details[1].trim();
				}
				
			}
			return (floor_number + "	" + total_floors);
		}
		else
		{
			String[] floor_details = null;
			String[] split_str = input.split(",");
			String floor_number = null, total_floors = null;
			for( int i = 0 ; i < split_str.length ; i++)
			{
				 
				if(split_str[i].contains("Out of"))
				{
					split_str[i] = split_str[i].replace("(","");
					split_str[i] = split_str[i].replace(")","");
					floor_details = split_str[i].split("Out of");
					floor_number = floor_details[0].trim();
					if(floor_number.equalsIgnoreCase("ground"))
						floor_number = "0";
					total_floors = floor_details[1].trim();
				}
				
			}
			return (floor_number + "	" + total_floors);
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
