import java.text.DecimalFormat;

public class ConvertModel {
	
		private double conversionValue;
		DecimalFormat df = new DecimalFormat("#.00");
		
		public void celsiusToFahrenheit(double firstNumber){
			conversionValue = (firstNumber*5/9) + 32;
		}
		
		public void fahrenheitToCelsius(double firstNumber){
			conversionValue = (firstNumber - 32)*5/9;
		}
		
		public String getConversionValue(){
			String answer = df.format(conversionValue);
			return answer;
		}
		
}
