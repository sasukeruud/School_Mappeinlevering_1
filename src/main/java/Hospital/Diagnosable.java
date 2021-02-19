package Hospital;

/**
 * @author Robin Ruud Kristensen
 * Interface class for what type of diagnosis a patient will have
 */
public interface Diagnosable {

    /**
     * Method to set what diagnosis on a person
     * @param diagnosis - variable first the diagnosis
     */
    void setDiagnosis(String diagnosis);
}
