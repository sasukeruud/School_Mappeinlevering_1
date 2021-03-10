package Hospital;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Robin Ruud Kristensen
 * Class to create the hospital and make a department arrayList where all the diffrent departments is.
 */
public class Hospital {

    //Final Name of the hospital
    private final String hospitalName;
    private final List<Department> departments;

    /**
     * Constructor for hospital
     * @param hospitalName - name of the hospital
     */
    public Hospital(String hospitalName) {
        if(hospitalName == null){
            throw new NullPointerException("Hospital name can't be set as a null value");
        }
        else if(hospitalName.isBlank()){
            throw new IllegalArgumentException("Hospital name can't be left blank, hospital needs a name");
        }
        else {
            this.hospitalName = hospitalName;
        }
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
     * @param department - name of the new department
     */
    public void addDepartment(Department department){
        if (departments.contains(department)){
            System.out.println("Department exist from before");
        }
        else {
            this.departments.add(department);
        }
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", departments=" + departments +
                '}';
    }
}
