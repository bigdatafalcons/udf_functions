package MBclean.MBclean;
import java.io.IOException;
import java.util.regex.Pattern;
import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;
public class Area_Conversion extends EvalFunc<String> 
{
    
	public String determine_Area (String input) throws IOException
	{
		Double Area;
		
    // USING PATTERN MATCHING
		Pattern p = Pattern.compile("(\\d+)(\\D+)"); 
		    java.util.regex.Matcher m = p.matcher(input);
		    while (m.find()) 
		    {
      	
		        if(m.group(2).equalsIgnoreCase("Sq.Yards")||m.group(2).equalsIgnoreCase("sqyrd")||m.group(2).equalsIgnoreCase("Sq.Yd.")||m.group(2).equalsIgnoreCase("Sq.Yd"))
		        {
		        	Area = Double.parseDouble(m.group(1));
		        	Area = Area * 9;
		        	String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
		        	String Ar = numWihoutDecimal.toString()+".00"+  "	Sq.Feet";
		 	        return Ar;
		        }
   
		        
    else if(m.group(2).equalsIgnoreCase("Acre")||m.group(2).equalsIgnoreCase("Acres"))
	{      
			Area = Double.parseDouble(m.group(1));
		    Area = Area * 43560;
		    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
		    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
	        return Ar;
	 }
	else if(m.group(2).equalsIgnoreCase("sqft")||m.group(2).equalsIgnoreCase("SqFt"))
	{
			  Area = Double.parseDouble(m.group(1)); 
			  String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
		   String Ar = numWihoutDecimal.toString()+".00"+  "	Sq.Feet";
		      return Ar;
	}
	 else if(m.group(2).equalsIgnoreCase("sqm"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area * 10.7639;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("bigha"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area * 17452.00;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("hectare"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area * 107639;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("marla"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area * 272.251;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("kanal"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area * 5445;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("biswa1"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area * 357142.85;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("biswa2"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area * 544499.99;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("ground"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area * 2400.38;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("aankadam"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area * 72;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("rood"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area * 10890;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("chatak"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area * 450;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("kottah"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area * 720;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("cent"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area * 435.54;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("guntha"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area * 1089.08;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("perch"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area * 272.3;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("are"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area * 1076.39;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }     
		        
		    }
		    return input;
	}
			
  @Override
	public String exec(Tuple input) throws IOException 
	{
		// TODO Auto-generated method stub
		 if (input == null || input.size() == 0)
		     return null;
		 
		 try
		 
		 {

		     String str = (String)input.get(0);
		     return determine_Area(str);
		     }
		     catch(Exception e)
		     {
		          //throw new IOException("Caught exception processing input row ", e);
		    	 return null;
		     }
	}


}
