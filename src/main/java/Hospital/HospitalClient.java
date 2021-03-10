package Hospital;

/**
 * @author Robin Ruud Kristensen
 * The main class to run the application
 */
public class HospitalClient {

    public static void main(String[] args) {
        Hospital stOlavsHospital = new Hospital("St. Olavs Hospital");
        HospitalTestData.fillRegisterWithTestData(stOlavsHospital);

        System.out.println("Application starts");
        System.out.println(stOlavsHospital.getHospitalName());

        System.out.println("Removing an employee and trying to remove a patient that is not in the list");
        try {
            stOlavsHospital.getDepartments().get(0).remove(stOlavsHospital.getDepartments().get(0).getEmployees().get(1));
            stOlavsHospital.getDepartments().get(0).remove(stOlavsHospital.getDepartments().get(1).getPatients().get(1));
        }
        catch (RemoveException e){
            System.out.println(e.getMessage());
        }

    }
}
