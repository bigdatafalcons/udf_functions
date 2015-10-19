package MBclean.MBclean;

import java.io.IOException;

import org.apache.pig.EvalFunc; 
import org.apache.pig.data.Tuple;

public class Mb_possession extends EvalFunc<String>{
	
	public String floor_number(String input) {
		
		if(input.contains(","))
		{
			String[] apartments_status = null;
			String[] split_str = input.split(",");
			//String possession = null, 
			 String possession_bydate=null; 
			for( int i = 0 ; i < split_str.length ; i++)
			{
				 
				if(split_str[i].contains("Possession by"))
				{
					split_str[i] = split_str[i].replace("(","");
					split_str[i] = split_str[i].replace(")","");
					apartments_status = split_str[i].split("Possession by");
					//possession = apartments_status[0].trim();
					possession_bydate=apartments_status[1].trim();
				}
				
			}
			return (possession_bydate);
		}
		
		else
		{
			String[] apartments_status = null;
			String[] split_str = input.split(",");
			//String  possession= null, 
			     String possession_bydate=null;
			for( int i = 0 ; i < split_str.length ; i++)
			{
				 
				if(split_str[i].contains("Possession by"))
				{
					split_str[i] = split_str[i].replace("(","");
					split_str[i] = split_str[i].replace(")","");
					apartments_status = split_str[i].split("Possession by");
					//possession = apartments_status[0].trim();
					possession_bydate=apartments_status[1].trim();
				}
				
			}
			return (possession_bydate);
		
			
			
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
