package patient;

import java.util.Random;

public class NewPatient implements Patient {

	public int id;
	public String treatment;
	public String diagnose;
	public boolean isAdmitted;

	public NewPatient() {
		System.out.println("NewPatient");
		id = new Random().nextInt(100);
		isAdmitted = false; // default Patient is not admitted
	}

	public void setId(int id) {
		// TODO Auto-generated method stub

	}

	// Here Changed from STRING to ID
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public boolean isAdmitted() {
		// TODO Auto-generated method stub
		return isAdmitted;
	}

	// Here Changed - Argument guven as boolean Status
	public void admitPatient() {
		// Keep this BLANK

	}

	public void diagnosePatient(String issue) {

	}

	public void treat(String treatment) {

	}

}
