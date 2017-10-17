package hospital;

public class Janitor extends HospitalEmployee {
	private boolean sweeping;
	public Janitor(String empName, String empNumber, boolean sweeping) {
		super(empName, empNumber);
		this.sweeping = sweeping;
	}

	public boolean isSweeping() {
		return sweeping;
	}

	@Override
	public double calculatePay() {
	
		return 40000;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t" + sweeping;
	}

}
