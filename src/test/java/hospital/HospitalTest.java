package hospital;

import static org.junit.Assert.*;

import org.junit.Test;

public class HospitalTest {
	@Test
	public void shouldBeAbleToCreateADoctorObject() {
		Doctor underTest = new Doctor("", "", "");
		assertNotNull(underTest);
	}
	
	@Test
	public void assertThatDoctorIsAHospitalEmployee() {
		HospitalEmployee underTest = new Doctor("", "", "");
		assertNotNull(underTest);
	}
	@Test
	public void shouldBeAbleToCreateASurgeonObject() {
		Surgeon underTest = new Surgeon("", "", "", false);
		assertNotNull(underTest);
	}
	@Test
	public void shouldBeAbleToCreateAReceptionistObject() {
		Receptionist underTest = new Receptionist("", "", true);
		assertNotNull(underTest);
	}
	@Test
	public void shouldBeAbleToCreateAJanitorObject() {
		Janitor underTest = new Janitor("", "", true);
		assertNotNull(underTest);
	}
	@Test
	public void assertThatJanitorIsAHospitalEmployee() {
		HospitalEmployee underTest = new Janitor("", "", true);
		assertNotNull(underTest);
	}
	@Test
	public void assertThatPatientHealthIs20() {
		Doctor underTest = new Doctor("", "", "");
		underTest.careForPatient();
		int check = underTest.getPatientHealth();
		assertEquals(20, check);
	}
	@Test
	public void assertThatSurgeonSalaryIs120000() {
		Surgeon underTest = new Surgeon("", "", "", true);
		underTest.careForPatient();
		double check = underTest.getPatientHealth();
		assertEquals(120000, check, 0);
	}
	
}
