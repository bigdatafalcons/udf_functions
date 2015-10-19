package MBclean.MBclean;

import java.io.IOException;
import org.apache.pig.EvalFunc; 
import org.apache.pig.data.Tuple;


public class PriceSeperator extends EvalFunc<String> 
{

	public String udf_price_seperator(String input) throws IOException 
	{
		String PriceArr[] = input.split(" ");
		Double price;

		String pr;

		// FUNCTION FOR LAC CONVERSION

		try {
			if(PriceArr[1].equalsIgnoreCase("Lacs") || PriceArr[1].equalsIgnoreCase("lac")) 
			{
				price = Double.parseDouble(PriceArr[0]);
				price = price * 100000;

				java.text.DecimalFormat df = new java.text.DecimalFormat("#######.00");
				pr = df.format(price).toString() + "	lac		";
				return pr ; 


			}
			else
			{     

				// FUNCTION FOR CRORE CONVERSION

				price = Double.parseDouble(PriceArr[0]);
				price = price * 10000000;

				java.text.DecimalFormat df = new java.text.DecimalFormat("#########.00");
				pr= df.format(price).toString() + "	crore		";
				return pr ; 


			}
		} catch (Exception e) {

			throw new IOException("price conversion failed!", e);
		}



	}

	public String rs_seperator (String input) throws IOException
	{
		String[] PriceArr = input.split(" ");

		Double price = Double.parseDouble(PriceArr[1]);
		try {
			if ( price >= 10000000)
			{
				java.text.DecimalFormat df = new java.text.DecimalFormat("#########.00");
				String pr = df.format(price).toString() + "	crore		" ;

				return pr;
			}
			else
			{
				java.text.DecimalFormat df = new java.text.DecimalFormat("#######.00");
				String pr = df.format(price).toString() + "	lac		" ;

				return pr;
			}
		} 
		catch (Exception e) {

			throw new IOException("price conversion failed!", e);
		}
	}

	// FUNCTION FOR MIN PRICE AND MAX PRICE

	public static String price_seperator_ip(String input1, String input2) throws IOException 
	{
		String PriceArr[] = input2.split(" ");
		Double min , max ;
		max = Double.parseDouble(PriceArr[1]);
		min = Double.parseDouble(input1);
		System.out.println(min + "	" + max);

		try {
			if(PriceArr[2].equalsIgnoreCase("lacs") || PriceArr[2].equalsIgnoreCase("lac")) 
			{

				max = max * 100000;

				min = min * 100000;
				java.text.DecimalFormat df = new java.text.DecimalFormat("#######.00");
				String price = "	lac	" + df.format(min).toString() + "	" + df.format(max).toString();

				return price; 

			}
			else
			{      
				max = max * 10000000;
				min = min * 10000000;
				java.text.DecimalFormat df = new java.text.DecimalFormat("#########.00");
				String price =  "	crore	" + df.format(min).toString() + "	" +df.format(max).toString();

				return price; 
			}
		} catch (Exception e) {

			throw new IOException("price conversion failed!", e);
		}




	}

	//FUNCTION FOR ABOVE,BELOW AND CALL FOR PRICE

	public String determine_price (String input) throws IOException
	{
		String Arr[] = input.split(" ");
		try {
			if (Arr[0].equalsIgnoreCase("Above") || Arr[0].equalsIgnoreCase("Below") || Arr[0].equalsIgnoreCase("Call") || Arr[0].equalsIgnoreCase("price"))
			{
				return input + "			";
			}

			else if (Arr[0].equalsIgnoreCase("Rs."))
			{

				String price = rs_seperator(input);

				return price;
			}

			else if (Arr.length == 4)
			{

				String range[] = input.split("to");
				String price;
				price = price_seperator_ip(range[0],range[1]);

				return price;
			}

			else if (Arr.length == 2)
			{
				String price = udf_price_seperator(input);
				return price;
			}

			else 
			{

				return input;
			}
		} catch (Exception e) {

			throw new IOException("price conversion failed!", e);
		}
	}


	@Override
	public String exec(Tuple input) throws IOException {
		if (input == null || input.size() == 0)
			return null;
		try{
			String str = (String)input.get(0);
			return determine_price(str);
		}catch(Exception e){
			String str = (String)input.get(0);
			return str + "			";
		}
	}
}



