package MBclean.MBclean;

import java.io.IOException;


import org.apache.pig.EvalFunc; 
import org.apache.pig.data.Tuple;

//import com.amazonaws.util.StringUtils;

public class status extends EvalFunc<String>{
	
	public String floor_number(String input) 
	{
		
		
		if (input.contains("Under Construction"))
		{
			return "Under Construction";
		
		}
		else if (input.contains("Ready to Move"))
		{
			return "Ready to Move";
		
		}
		else if (input.contains("Resale"))
		{
			return "Resale";
		
		}
		
		else if (input.contains("New Property"))
		{
			return "New Property";
		
		}
		
		
		return null;
		
		
		
		
	}
		
//		if(input.contains(","))
//		{
//			String[] apartments_status = null;
//			String[] split_str = input.split(",");
//			String possession = null;
//			for( int i = 0 ; i < split_str.length ; i++)
//			{
//				 
//				if(split_str[i].contains("Under Construction"))
//				{
//					
//					apartments_status = split_str[i].split("Under Construction");
//					possession = apartments_status[0].trim();
//					
//				}
//				
//			}
//			return (possession);
//		}
//		
//		else
//		{
//			String[] apartments_status = null;
//			String[] split_str = input.split(",");
//			String  possession= null, possession_bydate=null;
//			for( int i = 0 ; i < split_str.length ; i++)
//			{
//				 
//				if(split_str[i].contains("Under Construction,"))
//				{
//					
//				apartments_status = split_str[i].split("Under Construction");
//					possession = apartments_status[0].trim();
//					
//				}
//				
//			}
//			return (possession);
//		
//			
//			
//		}
//	}
//	
	
	
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
