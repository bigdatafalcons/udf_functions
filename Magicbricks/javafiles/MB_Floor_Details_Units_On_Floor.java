package MBclean.MBclean;

import java.io.IOException;

import org.apache.pig.EvalFunc; 
import org.apache.pig.data.Tuple;

public class MB_Floor_Details_Units_On_Floor extends EvalFunc<String>  
{
	public String units_on_floor(String input) {
		if(input.contains(","))
		{
			String[] floor_units = null;
			String[] split_str = input.split(",");
			for( int i = 0 ; i < split_str.length ; i++)
			{
				 
				if(split_str[i].contains("Units on the floor"))
				{
					floor_units = split_str[i].split(" Units on the floor");
					//return floor_units[0].trim();
				}
				
				else if (split_str[i].contains("Unit on the floor"))
				{
					floor_units = split_str[i].split(" Unit on the floor");
					//return floor_units[0].trim();
				}
			}
			return floor_units[0].trim();
		}
		else
		{
			String[] floor_units = null;
			String[] split_str = input.split(",");
			for( int i = 0 ; i < split_str.length ; i++)
			{
				 
				if(split_str[i].contains("Units on the floor"))
				{
					floor_units = split_str[i].split(" Units on the floor");
					//return floor_units[0].trim();
				}
				
				else if (split_str[i].contains("Unit on the floor"))
				{
					floor_units = split_str[i].split(" Unit on the floor");
					//return floor_units[0].trim();
				}
				
			}
			return floor_units[0].trim();
		}
	}
	
	@Override
	public String exec(Tuple input) throws IOException 
	{
		 if (input == null || input.size() == 0)
		     return null;
		 try{
		     String str = (String)input.get(0);
		     return units_on_floor(str);
		     }
		 catch(Exception e)
		 {
		    	 //String str = (String)input.get(0);
		    	 return null;
		  }
	}

	

}
