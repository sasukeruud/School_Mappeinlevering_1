package Hospital;

/**
 * @author Robin Ruud Kristensen
 * Class for make a new General practitioner for the hospital. It has the ability to change the diagnosis of a patient.
 */
public class GeneralPractitioner extends Doctor{

    /**
     * Constructor for new general practitioner doctor
     * @param firstName - first name of the general practitioner doctor
     * @param lastName - last name of the general practitioner doctor
     * @param socialSecurityNumber - social security number of the general practitioner doctor
     */
    public GeneralPractitioner(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    @Override
    public void setDiagnosis(Patient patient, String diagnosis) {
        patient.setDiagnosis(diagnosis);
    }
}
