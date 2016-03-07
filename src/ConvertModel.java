/**
 * @author Adriel Fabella
 */
import java.text.DecimalFormat;

public class ConvertModel {
	
		private double conversionValue; 
		
		/*
		 * Keeps decimal value to only 2 digits
		 */
		DecimalFormat df = new DecimalFormat("#.00");
		
		/**
		 * @param firstNumber
		 */
		public void celsiusToFahrenheit(double firstNumber){
			conversionValue = (firstNumber*5/9) + 32;
		}
		
		/**
		 * @param firstNumber
		 */
		public void fahrenheitToCelsius(double firstNumber){
			conversionValue = (firstNumber - 32)*5/9;
		}
		
		/**
		 * String answer cuts the value to only 2 decimal places
		 * @return
		 */
		public String getConversionValue(){
			String answer = df.format(conversionValue);
			return answer;
		}
		
}//end of class
