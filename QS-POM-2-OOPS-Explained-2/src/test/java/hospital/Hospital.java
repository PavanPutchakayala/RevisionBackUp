package hospital;

import org.testng.annotations.Test;

import patient.AdmittedPatient;
import patient.NewPatient;

public class Hospital {

	
	@Test
	public void testPatient() {
		new NewPatient();
		new AdmittedPatient();
	}
}
