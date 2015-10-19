package MBclean.MBclean;

import java.io.IOException;

import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;
import org.apache.commons.lang.StringUtils;

public class flooring extends EvalFunc<String>  
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
		String header = "flooring_Marble	flooring_Wood	flooring_Normal_Tiles	flooring_Ceramic_Tiles	flooring_Granite	flooring_Marbonite	flooring_Mosaic	flooring_Vitrified";
		if(StringUtils.containsIgnoreCase(input, "apartments_flooring"))
			return header;
		else
		{
		
		if(StringUtils.containsIgnoreCase(input, "Marble"))
			dummies = "1";
		else 
			dummies = "0";
		if(StringUtils.containsIgnoreCase(input, "Wooden"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		if(StringUtils.containsIgnoreCase(input, "Normal Tiles/Kotah Stone"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		if(StringUtils.containsIgnoreCase(input, "Ceramic Tiles"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		
		if(StringUtils.containsIgnoreCase(input, "Granite"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		if(StringUtils.containsIgnoreCase(input, "Marbonite"))
			dummies = dummies + "	1";
		else 
			dummies = dummies + "	0";
		if(StringUtils.containsIgnoreCase(input, "Mosaic"))
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
