package Hospital;

/**
 * @author Robin Ruud Kristensen
 * Class to make a new surgeon to the hospital. It has the ability to change the diagnosis of a patient.
 */
public class Surgeon extends Doctor{

    /**
     * Constructor for a surgeon doctor
     * @param firstName - first name of the surgeon doctor
     * @param lastName - last name of the surgeon doctor
     * @param socialSecurityNumber - social security number of the surgeon doctor
     */
    public Surgeon(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public void setDiagnosis(Patient patient, String diagnosis) {
        patient.setDiagnosis(diagnosis);
    }
}
