package Hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    //Final Name of the hospital
    private final String hospitalName;
    private final List<Department> departments;

    /**
     * Constructor for hospital
     * @param hospitalName - name of the hospital
     */
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.departments = new ArrayList<>();
    }

    /**
     * Method to get the name of the hospital
     * @return returns the hospital name
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * Method to get the list of departments
     * @return returns the department list
     */
    public List<Department> getDepartments() {
        return departments;
    }

    /**
     * Method to add a new department to the list of departments that already exists
     * @param departmentName - name of the new department
     */
    public void addDepartment(String departmentName){
        Department department = new Department(departmentName);
        this.departments.add(department);
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", departments=" + departments +
                '}';
    }
}
