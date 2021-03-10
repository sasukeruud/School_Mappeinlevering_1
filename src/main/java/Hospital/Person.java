package Hospital;

/**
 * @author Robin Ruud Kristensen
 * Class to create a new person in the program
 */
public abstract class Person {

    //Local variables in the class
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    /**
     * Constructor for a new person
     * @param firstName - first name of the person
     * @param lastName - last name of the person
     * @param socialSecurityNumber - the number to identify the person
     */
    public Person(String firstName, String lastName, String socialSecurityNumber) {
        //Checks if there is a null value entered in the first name
        if (firstName == null){
            throw new NullPointerException("No first name was entered for the new person that was going to be" +
                    " implemented");
        }
        else {
            this.firstName = firstName;
        }
        //Checks if there is a null value entered in the last name
        if (lastName == null){
            throw new NullPointerException("No last name was entered for the new person that was going to be" +
                    " implemented");
        }
        else {
            this.lastName = lastName;
        }
        //Checks if there is a null value entered in the social security number
        if (socialSecurityNumber == null){
            throw new NullPointerException("No social Security Number was entered for the new person that was going to"
                    + " be implemented");
        }
        else {
            this.socialSecurityNumber = socialSecurityNumber;
        }
    }

    /**
     * Method to get the first name of the person
     * @return returns first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Method to set what the first name is
     * @param firstName - the variable of the new first name becomes
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Method to get the last name of the person
     * @return returns last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Method to set what the last name is
     * @param lastName - the variable of the new last name becomes
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Method to get the social security number
     * @return returns social security number
     */
    public String getPersonNumber() {
        return socialSecurityNumber;
    }

    /**
     * Method to set what the social security number is
     * @param socialSecurityNumber - the variable of the new social security number
     */
    public void setPersonNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * Method to write out the first name, last name and security number of a person
     * @return returns a string value of all the information about the person
     */
    @Override
    public String toString() {
        return "Hospital.Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}
