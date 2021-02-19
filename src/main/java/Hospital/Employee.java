package Hospital;

/**
 * @author Robin Ruud Kristensen
 * Class for constucting a new employee in the hospital
 */
public class Employee extends Person{

    /**
     * Constructor for a new employee
     * @param firstName - first name of employee
     * @param lastName - last name of employee
     * @param socialSecurityNumber - social security number of employee
     */
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     * Method to write out employees
     * @return returns a string value of the information about an employee
     */
    @Override
    public String toString() {
        return "Hospital.Employee{"
                + "\nfirst name of employee:: " + this.getFirstName()
                + "\nLast name of employee:: " + this.getLastName()
                +"\n}";
    }
}
