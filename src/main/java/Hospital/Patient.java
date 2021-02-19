package Hospital;

/**
 * @author Robin Ruud Kristensen
 * Class to add a new patient to the hospital, and to add/change the diagnosis of a patient.
 */
public class Patient extends Person implements Diagnosable{

    //Local variable for diagnosis in patient
    private String diagnosis = "";

    /**
     * Constructor for patient
     * @param firstName - first name of the patient
     * @param lastName - last name of the patient
     * @param socialSecurityNumber - social security number of the patient
     */
    public Patient(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    /**
     * Method to get what the diagnosis is
     * @return returns the diagnosis on the patient
     */
    public String getDiagnosis() {
        return diagnosis;
    }

    /**
     * Method that says what the diagnosis is for the patient
     * @return returns the diagnosis of a patient
     */
    @Override
    public String toString() {
        return "Hospital.Patient{"
                + "\nFirst name of patient:: " + this.getFirstName()
                + "\nLast name of patient:: " + this.getLastName()
                + "\nSocial security number of patient:: " + this.getPersonNumber()
                + "\ndiagnosis:: " + diagnosis
                + "\n}";
    }
}
