package patient;

import java.util.Random;

public class NewPatient implements Patient {

	public int id;
	public String treatment;
	public String diagnose;
	public boolean isAdmitted;
	
	public NewPatient() {
		id = new Random().nextInt(100);
	}

	public void setId(int id) {
		// TODO Auto-generated method stub

	}

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isAdmitted() {
		// TODO Auto-generated method stub
		return isAdmitted;
	}

	public void admitPatient() {
		// TODO Auto-generated method stub

	}
	
	public void diagnosePatient(String issue) {
		
	}
	
	public void treat(String treatment) {
		
	}
	
	

}
