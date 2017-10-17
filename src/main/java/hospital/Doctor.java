package hospital;

public class Doctor extends HospitalEmployee implements MedicalDuties{
	protected String specialty;

	public Doctor(String empName, String empNumber, String specialty) {
		super(empName, empNumber);
		this.specialty = specialty;
	}
	
	String getSpecialty() {
		return specialty;
	}
	
	@Override
	public double calculatePay() {
		return 90000;
	}
	
	@Override
	public boolean drawBlood() {
		return true;
	}
	
	@Override
	public void careForPatient() {
		patientHealth *= 2;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t" + specialty;
	}
	

}
