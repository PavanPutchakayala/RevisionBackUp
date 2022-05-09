package patient;

public interface Patient {

	void setId(int id);
	int getId();
	boolean isAdmitted();
	void admitPatient();
	void diagnosePatient(String issue);
	void treat(String treatment);
}
