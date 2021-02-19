package Hospital;

/**
 * @author Robin Ruud Kristensen
 * Abstract class for what type of doctor it will be
 */
public abstract class Doctor extends Employee{

    /**
     * Constructor to make a new object of doctor
     * @param firstName - first name of the doctor
     * @param lastName - last name of the doctor
     * @param socialSecurityNumber - social security number of the doctor
     */
    public Doctor(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     * Method for a doctor to add a diagnosis to a patient
     * @param patient - the patient the diagnosis is about
     * @param diagnosis - what kind of diagnosis is made
     */
    public abstract void setDiagnosis(Patient patient, String diagnosis);
}
