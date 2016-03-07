
public class MVCCalculator {

	public static void main(String[] args) {
			
			ConvertView theView = new ConvertView(); 
			ConvertModel theModel = new ConvertModel();
			ConvertController theController = new ConvertController(theView, theModel);
			
			
			theView.setVisible(true);
			
			

	}

}
