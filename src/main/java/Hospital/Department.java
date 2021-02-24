package Hospital;

import java.util.HashMap;
import java.util.Map;

public class Department {

    private String departmentName;
    private Map<String, Employee> employees;
    private Map<String, Patient> patients;

    /**
     * Constructor for department
     * @param departmentName - name of the department
     */
    public Department(String departmentName) {
        if (departmentName == null){
            throw new NullPointerException("Department name can't be null");
        }
        else {
            this.departmentName = departmentName;
        }

        this.employees = new HashMap<>();
        this.patients = new HashMap<>();
    }

    /**
     * Method to get the name of the department
     * @return returns department name
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Method to set a new name of a department
     * @param departmentName - new name of the department
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /**
     * Method to get the HashMap of employees
     * @return returns the HashMap employees
     */
    public Map<String, Employee> getEmployees() {
        return employees;
    }

    /**
     * Method to get the HashMap of patients
     * @return returns the HashMap patients
     */
    public Map<String, Patient> getPatients() {
        return patients;
    }
}
