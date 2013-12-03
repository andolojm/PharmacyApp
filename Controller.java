import javax.swing.JFrame;
	//coded by Jeff Andolora, 11/20ish
public class Controller {
	
	/*
	A bit of an update on how i'm doing this:
	
	this is the model of the 'mvc' framework we're using. 
	the forms send their data here, and this will interact with the controller (data access class, fileIO)
	this class is gonna end up with a metric crap ton of methods, all of which will be passing data back and forth.
	
	add new methods as needed, but don't touch the ones that are already here. 
	
	-Jeff, 11/24
	
	*/
	
	public void shutdown(){
		System.exit(0);
	}

	
	//Menu start methods
	
	public void mainMenuStart(JFrame frame){ 
		MainGUI view = new MainGUI();
		view.startGUI();
	}
	
	//called from MainGUI
	public void addMenuStart(JFrame frame){
		frame.setVisible(false);
		addMenu view2 = new addMenu();
		view2.startGUI();
	}
	public void updateMenuStart(JFrame frame){
		frame.setVisible(false);
		//updateMenu view2 = new updateMenu();
		//view2.startGUI();
	}
	public void viewMenuStart(JFrame frame){
		frame.setVisible(false);
		//updateMenu view2 = new updateMenu();
		//view2.startGUI();
	}
	
	//called from add forms
	public void addPatientMenuStart(JFrame frame){
		frame.setVisible(false);
		addPatientMenu view2 = new addPatientMenu();
		view2.startGui();
	}
	public void addPhysicianMenuStart(JFrame frame){
		frame.setVisible(false);
		addPhysicianMenu view2 = new addPhysicianMenu();
		view2.startGui();
	}
	public void addInsuranceMenuStart(JFrame frame){
		frame.setVisible(false);
		addInsuranceMenu view2 = new addInsuranceMenu();
		view2.startGui();
	}
	public void addMedicineMenuStart(JFrame frame){
		frame.setVisible(false);
		addMedicineMenu view2 = new addMedicineMenu();
		view2.startGui();
	}
	
	//called from addPatientMenu and updatePatientMenu
	public void addPerscriptionMenuStart(JFrame frame){
		frame.setVisible(false);
		addPerscriptionMenu view2 = new addPerscriptionMenu();
		view2.startGui();
	}
	
}
