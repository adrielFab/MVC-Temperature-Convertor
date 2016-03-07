import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

public class ConvertController {
	
	private ConvertView theView;
	private ConvertModel theModel;
	private String operation;
	
	public ConvertController(ConvertView theView, ConvertModel theModel){
		
			this.theView = theView;
			this.theModel = theModel;
			this.theView.addCalculationListener(new CalculateListener());
			this.theView.addButtonListener(new ButtonListener());
	}//contructor
	
	class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			CalculateListener obj = new CalculateListener();
			double firstNumber = 0;
			
			String action = e.getActionCommand();
			if(action.equals("Result")){
				try{
							firstNumber = theView.getFirstNumber();
							System.out.println(firstNumber);
							System.out.println(operation);
							switch(operation){
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
			
		}//actionPerformed
	}//ButtonListener class
	
	class CalculateListener implements ActionListener{
		ButtonListener obj = new ButtonListener();
		
		public void actionPerformed(ActionEvent e) {			
			if(e.getSource() == theView.getOperationsList() ){
					JComboBox cb = (JComboBox)e.getSource();
					 operation = (String)cb.getSelectedItem();
					obj.actionPerformed(e);
			}//if	
		}//actionPerformed()
		
	}//CalculateListener class
	
}//Global class
