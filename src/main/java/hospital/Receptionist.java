package hospital;

public class Receptionist extends HospitalEmployee {
private boolean answerPhones;
	public Receptionist(String empName, String empNumber, boolean answerPhones) {
		super(empName, empNumber);
		this.answerPhones = true;
	}

	public boolean isAnswerPhones() {
		return answerPhones;
	}

	@Override
	public double calculatePay() {

		return 45000;
	}

	@Override
	public String toString() {
		return super.toString() + "\t" + answerPhones;
	}
}
