package Hospital;

/**
 * @author Robin Ruud Kristensen
 * Class to make a new nurse to the hospital.
 */
public class Nurse extends Employee{

    /**
     * Constructor to make a new nurse in the hospital
     * @param firstName - first name of the nurse
     * @param lastName - last name of the nurse
     * @param socialSecurityNumber - social security number of the nurse
     */
    public Nurse(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public String toString() {
        return "Hospital.Nurse{"
                + "\nFirst name of nurse:: " + this.getFirstName()
                + "\nLast name of nusre:: " + this.getLastName()
                + "\n}";
    }
}
