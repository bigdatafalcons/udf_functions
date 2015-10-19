package MBclean.MBclean;

import java.io.IOException;

import org.apache.pig.EvalFunc; 
import org.apache.pig.data.Tuple;

public class Mb_plot_area extends EvalFunc<String>{
	
	public String floor_number(String input) {
		
		if(input.contains(","))
		{
			String[] apartments_area_detail = null;
			String[] split_str = input.split(",");
			String plot_area = null; 
			for( int i = 0 ; i < split_str.length ; i++)
			{
				 
				if(split_str[i].contains("plot"))
				{
					split_str[i] = split_str[i].replace("(","");
					split_str[i] = split_str[i].replace(")","");
					apartments_area_detail = split_str[i].split("plot");
					plot_area = apartments_area_detail[0].trim();
					
				}
				
			}
			return (plot_area);
		}
		
		else
		{
			
			
			String plot_area = null; 
			
			return (plot_area);
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

