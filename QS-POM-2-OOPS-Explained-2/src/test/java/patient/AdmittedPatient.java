package patient;

public class AdmittedPatient extends NewPatient{

	public AdmittedPatient() {
		System.out.println("AdmittedPatient");
	}
	@Override
	public void admitPatient() {

		isAdmitted=true;
	}
}
