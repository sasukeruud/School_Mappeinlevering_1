package Hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Robin Ruud Kristensen
 * Class to create new departments and control what is in a spesific department arrayList
 */
public class Department {

    private String departmentName;
    private final List<Employee> employees;
    private final List<Patient> patients;

    /**
     * Constructor for department
     * @param departmentName - name of the department
     */
    public Department(String departmentName) {
        if (departmentName == null){
            throw new NullPointerException("Department name can't be null");
        }
        else if(departmentName.isBlank()){
            throw new IllegalArgumentException("Department name need characters to be made");
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

    /**
     * Method to add a new employee to the employee arrayList
     * @param employee - the employee object that is going to be added to the employee arrayList
     */
    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    /**
     * Method to add a new patient to the patient arrayList
     * @param patient - the patient object that is going to be added to the patient list
     */
    public void addPatient(Patient patient){
        this.patients.add(patient);
    }

    /**
     * Method to remove ether a patient or an employee from there respective arrayList.
     *
     * The first part of the method does is to check if person is an instanceof of the class patient or not, if it is then it
     * will check if the arrayList have the same object inn it. If not then it will not delete anything and return an
     * exception messages.
     * The second part will do the same but for employee class, and if neither of those instanceof is true it will
     * automatically throw an exception to the user telling him that the user doesn't exist.
     *
     * @param person - the object that is going to be removed from the arrayList.
     * @throws RemoveException - An exception that can happen if the person you are trying to delete is not in any of
     * the arrayList.
     */
    public void remove(Person person) throws RemoveException {
        if(person instanceof Patient){
            if(patients.contains(person)) {
                this.patients.remove(person);
            }
            else {
                throw new RemoveException("The patient you tried to deleted doesn't exist in any list in the hospital");
            }
        }
        else if(person instanceof Employee) {
            if(employees.contains(person)) {
                this.employees.remove(person);
            }
            else {
                throw new RemoveException("The employee you tried to deleted doesn't exist in any list in the hospital");
            }
        }
        else {
            throw new RemoveException("The person you tried to deleted doesn't exist in any list in the hospital");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return departmentName.equals(that.departmentName) && Objects.equals(employees, that.employees) &&
                Objects.equals(patients, that.patients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentName, employees, patients);
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", employees=" + employees +
                ", patients=" + patients +
                '}';
    }
}
