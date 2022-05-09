package patient;

public interface Patient {

	void setId(int id);
	String getId();
	boolean isAdmitted();
	void admitPatient();
	void diagnosePatient(String issue);
	void treat(String treatment);
}
