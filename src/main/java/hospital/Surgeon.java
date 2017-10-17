package hospital;

public class Surgeon extends Doctor implements MedicalDuties{
	protected boolean operating;

	public Surgeon(String empName, String empNumber, String specialty, boolean operating) {
		super(empName, empNumber, specialty);
		this.operating = operating;
	}

	public boolean isOperating() {
		return operating;
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
	public double calculatePay() {
		return 120000;
	}

	@Override
	public String toString() {
		return super.toString() + "\t" + specialty;
	}

}
