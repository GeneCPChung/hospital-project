package hospital;

public class Nurse extends HospitalEmployee implements MedicalDuties{

	private int patients;

	public Nurse(String empName, String empNumber, int patients) {
		super(empName, empNumber);
		this.patients = patients;
	}
	
	public int getPatients() {
		return patients;
	}

	@Override
	public double calculatePay() {
		
		return 50000;
	}
	
	@Override
	public boolean drawBlood() {
		return true;
	}
	
	@Override
	public void careForPatient() {
		patientHealth += 5;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t" + patients;
	}
}
