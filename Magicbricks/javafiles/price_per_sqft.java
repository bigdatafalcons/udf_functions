package MBclean.MBclean;
import java.io.IOException;
import java.util.regex.Pattern;
import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;
public class price_per_sqft extends EvalFunc<String> 
{
    
	public String determine_Area (String input) throws IOException
	{
		Double Area;
		
    // USING PATTERN MATCHING
		Pattern p = Pattern.compile("(\\d+)(\\D+)"); 
		    java.util.regex.Matcher m = p.matcher(input);
		    while (m.find()) 
		    {
      	
		        if(m.group(2).equalsIgnoreCase("persqyrd"))
		        {
		        	Area = Double.parseDouble(m.group(1));
		        	Area = Area / 9;
		        	String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
		        	String Ar = numWihoutDecimal.toString()+".00"+  "	Sq.Feet";
		 	        return Ar;
		        }
   
		        
    else if(m.group(2).equalsIgnoreCase("peracre"))
	{      
			Area = Double.parseDouble(m.group(1));
		    Area = Area / 43560;
		    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
		    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
	        return Ar;
	 }
	else if(m.group(2).equalsIgnoreCase("persqft"))
	{
			  Area = Double.parseDouble(m.group(1)); 
			  String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
		   String Ar = numWihoutDecimal.toString()+".00"+  "	Sq.Feet";
		      return Ar;
	}
	 else if(m.group(2).equalsIgnoreCase("persqm"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area / 10.7639;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("perbigha"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area / 17452.00;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("perhectare"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area / 107639;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("permarla"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area / 272.251;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("perkanal"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area / 5445;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("perbiswa1"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area / 357142.85;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("perbiswa2"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area / 544499.99;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("perground"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area / 2400.38;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("peraankadam"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area / 72;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("perrood"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area / 10890;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("perchatak"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area / 450;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("perkottah"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area / 720;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("percent"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area / 435.54;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("perguntha"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area / 1089.08;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("perperch"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area / 272.3;
			    String numWihoutDecimal = String.valueOf(Area).split("\\.")[0];
			    String Ar = numWihoutDecimal.toString()+".00"+ "	Sq.Feet";
		        return Ar;
		 }
	 else if(m.group(2).equalsIgnoreCase("perare"))
		{      
				Area = Double.parseDouble(m.group(1));
			    Area = Area / 1076.39;
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
