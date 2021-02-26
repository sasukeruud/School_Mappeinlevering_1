package Hospital;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String departmentName;
    private List<Employee> employees;
    private List<Patient> patients;
    //private Map<String, Employee> employees;

    /**
     * Constructor for department
     * @param departmentName - name of the department
     */
    public Department(String departmentName) {
        if (departmentName == null){
            throw new NullPointerException("Department name can't be null");
        }
        else if(departmentName.isBlank()){
            throw new IllegalArgumentException("Department name ned characters to be made");
        }
        else {
            this.departmentName = departmentName;
        }

        this.employees = new ArrayList<>();
        this.patients = new ArrayList<>();
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
    public List<Employee> getEmployees() {
        return employees;
    }

    /**
     * Method to get the HashMap of patients
     * @return returns the HashMap patients
     */
    public List<Patient> getPatients() {
        return patients;
    }
}
