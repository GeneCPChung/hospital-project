package hospital;

import java.util.*;

public class Hospital {
	private Map<String, HospitalEmployee> hospitalEmployees = new HashMap<String, HospitalEmployee>();
	
	public Collection<HospitalEmployee> hospitalStaffValues() {
		return hospitalEmployees.values();
	}
	
	public void addEmployee(HospitalEmployee employee) {
		hospitalEmployees.put(employee.getEmpNumber(), employee);
	}
	
	public void removeEmployee(String empNumber) {
		hospitalEmployees.remove(empNumber);
	}
	
	
}
