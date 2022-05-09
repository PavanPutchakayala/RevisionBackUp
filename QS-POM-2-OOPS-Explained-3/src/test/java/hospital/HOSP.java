package hospital;

import patient.AdmittedPatient;
import patient.NewPatient;
import patient.Patient;

public class HOSP {

	public static void main(String[] args) {

		HOSP hospital = new HOSP();
		Patient p = hospital.treatPatient("heart");
		
		if(p instanceof NewPatient) {
			
		} else if (p instanceof AdmittedPatient) {
			
		}
		
		System.out.println(p instanceof NewPatient);
		System.out.println(p instanceof AdmittedPatient);
	}

	public Patient treatPatient(String symptom) {
		Patient p = null;
		if (symptom.equals("fever")) {
			// Dont admit
			p = new NewPatient();
			System.out.println(p.getId());
			System.out.println(p.isAdmitted());

		} else {
			// admit
			System.out.println("-------------");
			p = new AdmittedPatient();
			p.admitPatient();
			System.out.println(p.getId());
			System.out.println(p.isAdmitted());
		}
		return p;

	}

}
