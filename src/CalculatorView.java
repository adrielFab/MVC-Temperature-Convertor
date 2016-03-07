import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorView extends JFrame{
			
		private JTextField firstNumber = new JTextField (10);
		private JTextField calcSolution = new JTextField(10);
		private JLabel label = new JLabel("First Number: ");
		
		/*
		 * ComboBox
		 */
		private String [] operations = {"Choose a conversion method", "Celsius to Fahrenheit", "Fahrenheit to Celsius"};//
		private JComboBox operationsList = new JComboBox(operations);//
		
		CalculatorView(){
			JPanel calcPanel = new JPanel();
			
			this.setLayout(new FlowLayout());
			this.setTitle("Temperature Conversion");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setSize(600,200);
			
			operationsList.setSelectedIndex(0);
			
			calcPanel.add(label);
			calcPanel.add(firstNumber);
			calcPanel.add(operationsList);
			calcPanel.add(calcSolution);
			
			this.add(calcPanel);
		}
		
		public JComboBox getOperationsList(){
			return operationsList;
		}
		
		public int getFirstNumber(){
			return Integer.parseInt(firstNumber.getText());
		}
		
		public int getCalcSolution(){
			return Integer.parseInt(calcSolution.getText());
		}
		
		public void setCalcSolution(double solution){
			calcSolution.setText(Double.toString(solution));
			
		}
		
		void addCalculationListener(ActionListener listenerForCalcButton){
				operationsList.addActionListener(listenerForCalcButton);
		}
		
		/*
		 * Error Display
		 */
		void displayErrorMessage(String errorMessage){
				JOptionPane. showMessageDialog(this, errorMessage);
		}
}
