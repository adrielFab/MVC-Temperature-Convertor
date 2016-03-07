import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

public class CalculatorController {
	
	private CalculatorView theView;
	private CalculatorModel theModel;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel){
		
			this.theView = theView;
			this.theModel = theModel;
			this.theView.addCalculationListener(new CalculateListener());
	}//contructor
	
	class CalculateListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == theView.getOperationsList()){
					JComboBox cb = (JComboBox)e.getSource();
					String msg = (String)cb.getSelectedItem();
					double firstNumber = 0;
					
					try{
							firstNumber = theView.getFirstNumber();
							switch(msg){
								case "Celsius to Fahrenheit" :
									theModel.celsiusToFahrenheit(firstNumber);
									theView.setCalcSolution(theModel.getConversionValue());
									break;
								case "Fahrenheit to Celsius" :
									theModel.fahrenheitToCelsius(firstNumber);
									theView.setCalcSolution(theModel.getConversionValue());
									break;
							}//switch
					}//try
					catch(Exception ex){
						theView.displayErrorMessage("Error! Insert an appropriate value!");
					}//catch
			}//if	
		}//actionPerformed()
		
	}//class
	
	

}
