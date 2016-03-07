public class ConvertModel {
	
		private double conversionValue;
		
		public void celsiusToFahrenheit(double firstNumber){
			conversionValue = (firstNumber*5/9) + 32;
		}
		
		public void fahrenheitToCelsius(double firstNumber){
			conversionValue = (firstNumber - 32)*5/9;
		}
		
		public double getConversionValue(){
			return conversionValue;
		}
		
}
