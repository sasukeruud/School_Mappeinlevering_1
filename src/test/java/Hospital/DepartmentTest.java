package Hospital;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {

    Department department;
    Employee employee1;
    Employee employee2;
    Patient patient1;
    Patient patient2;
    Patient patient3;
    Patient patient4;
    Surgeon surgeon1;
    Nurse nurse1;
    GeneralPractitioner generalPractitioner1;

    @BeforeAll
    static void beforeAll(){
        System.out.println("-------------------------------------------------------------");
        System.out.println("Tests for Hospital.Department class");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Tests for Hospital.Department class is completed");
        System.out.println("-------------------------------------------------------------");
    }

    @BeforeEach
    void beforeEach(){
        department = new Department("test");
        employee1 = new Employee("test","test","test");
        employee2 = new Employee("test","test","test");
        patient1 = new Patient("test","test","test");
        patient2 = new Patient("test","test","test");
        patient3 = new Patient("test","test","test");
        patient4 = new Patient("test","test","test");
        surgeon1 = new Surgeon("test","test","test");
        nurse1 = new Nurse("test","test","test");
        generalPractitioner1 = new GeneralPractitioner("test","test",
                "test");
        department.addPatient(patient1);
        department.addPatient(patient2);
        department.addPatient(patient3);
        department.addPatient(patient4);
        department.addEmployee(employee1);
        department.addEmployee(employee2);
        department.addEmployee(surgeon1);
        department.addEmployee(nurse1);
        department.addEmployee(generalPractitioner1);
    }

    @AfterEach
    void afterEach(){
        department.getEmployees().clear();
        department.getPatients().clear();
    }

    @Test
    @DisplayName("Test for setter and getter for Department works correctly")
    public void testGetterAndSetterDepartment(){
        department.setDepartmentName("ER");
        assertEquals("ER",department.getDepartmentName());
        assertNotEquals("MR",department.getDepartmentName());
    }

    @Test
    @DisplayName("Test for add employee to employee arrayList if correct")
    public void testAddEmployeeTrue(){
        //Checks that all the variables of the employee is correct in the arrayList
        assertEquals("test",department.getEmployees().get(0).getFirstName());
        assertEquals("test",department.getEmployees().get(0).getLastName());
        assertEquals("test",department.getEmployees().get(0).getPersonNumber());
    }

    @Test
    @DisplayName("Test for add employee to employee arrayList if Wrong")
    public void testAddEmployeeFalse(){
        Employee employee1 = new Employee("test","test","test");
        Employee employee2 = new Employee("test","test","test");
        department.addEmployee(employee1);
        department.addEmployee(employee2);
        //Checks that it's the same object
        assertNotEquals(department.getEmployees().get(1),employee1);
        //Checks that all the variables of the employee1 is not something else than what is set
        assertNotEquals("Wrong",department.getEmployees().get(0).getFirstName());
        assertNotEquals("Wrong",department.getEmployees().get(0).getLastName());
        assertNotEquals("Wrong",department.getEmployees().get(0).getPersonNumber());
    }

    @Test
    @DisplayName("Test for add patient to patient arrayList if correct")
    public void testAddPatientTrue(){
        //Checks that all the variables of the patient is correct in the arrayList
        assertEquals("test",department.getPatients().get(0).getFirstName());
        assertEquals("test",department.getPatients().get(0).getLastName());
        assertEquals("test",department.getPatients().get(0).getPersonNumber());
    }

    @Test
    @DisplayName("Test for add employee to employee arrayList if Wrong")
    public void testAddPatientFalse(){
        Patient patient1 = new Patient("test","test","test");
        Patient patient2 = new Patient("test","test","test");
        department.addPatient(patient1);
        department.addPatient(patient2);
        //Checks that it's the same object
        assertNotEquals(department.getPatients().get(1),patient1);
        //Checks that all the variables of the patient1 is not something else than what is set
        assertNotEquals("Wrong",department.getPatients().get(0).getFirstName());
        assertNotEquals("Wrong",department.getPatients().get(0).getLastName());
        assertNotEquals("Wrong",department.getPatients().get(0).getPersonNumber());
    }

    @Test
    @DisplayName("Test for remove method in department for employee if the employee exist")
    public void testRemoveForEmployeesIfExists() {
        assertEquals(5,department.getEmployees().size());
        try {
            department.remove(employee1);
        }
        catch (RemoveException e){
            System.out.println(e.getMessage());
        }
        assertEquals(4,department.getEmployees().size());
    }

    @Test
    @DisplayName("Test for remove method in department for employee if the employee doesn't exist")
    public void testRemoveForEmployeesNotExists() {
        Employee employee3 = new Employee("test","test","test");
        assertEquals(5,department.getEmployees().size());
        try {
            department.remove(employee3);
        }
        catch (RemoveException e){
            System.out.println(e.getMessage());
        }
        assertEquals(5,department.getEmployees().size());
    }

    @Test
    @DisplayName("Test for remove method in department")
    public void testRemoveForPatientsIfExists() {
        assertEquals(4,department.getPatients().size());
        try {
            department.remove(patient2);
        }
        catch (RemoveException e){
            System.out.println(e.getMessage());
        }
        assertEquals(3,department.getPatients().size());
    }

    @Test
    @DisplayName("Test for remove method in department for employee if the employee doesn't exist")
    public void testRemoveForPatientNotExists() {
        Patient patient5 = new Patient("test","test","test");
        assertEquals(4,department.getPatients().size());
        try {
            department.remove(patient5);
        }
        catch (RemoveException e){
            System.out.println(e.getMessage());
        }
        assertEquals(4,department.getPatients().size());
    }

    @Test
    @DisplayName("Assert that remove method remove from correct arrayList")
    public void testCheckRemoveByRemovingMultiple(){
        try{
            department.remove(patient1);
            department.remove(employee1);
            department.remove(patient4);
        }
        catch (RemoveException e){
            System.out.println(e.getMessage());
        }
        assertEquals(4,department.getEmployees().size());
        assertEquals(2,department.getPatients().size());
    }

    @Test
    @DisplayName("Test for adding an object of surgeon class to the employee arrayList")
    public void testAddEmployeeOfClassTypeSurgeon(){
        Surgeon surgeon = new Surgeon("test","test","test");
        department.addEmployee(surgeon);
        assertEquals(6,department.getEmployees().size());
    }

    @Test
    @DisplayName("Test for adding an object of nurse class to the employee arrayList")
    public void testAddEmployeeOfClassTypeNurse(){
        Nurse nurse = new Nurse("test","test","test");
        department.addEmployee(nurse);
        assertEquals(6,department.getEmployees().size());
    }

    @Test
    @DisplayName("Test for adding an object of GeneralPractitioner class to the employee arrayList")
    public void testAddEmployeeOfClassTypeGeneralPractitioner(){
        GeneralPractitioner generalPractitioner = new GeneralPractitioner("test","test",
                "test");
        department.addEmployee(generalPractitioner);
        assertEquals(6,department.getEmployees().size());
    }

    @Test
    @DisplayName("Test for remove if the employee is of the class Surgeon")
    public void testRemoveIfEmployeeIsSurgeon(){
        try {
            department.remove(surgeon1);
        }
        catch (RemoveException e){
            System.out.println(e.getMessage());
        }
        assertEquals(4,department.getEmployees().size());
    }

    @Test
    @DisplayName("Test for remove if the employee is of the class Nurse")
    public void testRemoveIfEmployeeIsNurse(){
        try {
            department.remove(nurse1);
        }
        catch (RemoveException e){
            System.out.println(e.getMessage());
        }
        assertEquals(4,department.getEmployees().size());
    }

    @Test
    @DisplayName("Test for remove if the employee is of the class GeneralPractitioner")
    public void testRemoveIfEmployeeIsGeneralPractitioner(){
        try {
            department.remove(generalPractitioner1);
        }
        catch (RemoveException e){
            System.out.println(e.getMessage());
        }
        assertEquals(4,department.getEmployees().size());
    }

    @Test
    @DisplayName("Test for remove method in department for employee if the surgeon doesn't exist")
    public void testRemoveForSurgeonNotExists() {
        Surgeon surgeon = new Surgeon("test","test","test");
        assertEquals(5,department.getEmployees().size());
        try {
            department.remove(surgeon);
        }
        catch (RemoveException e){
            System.out.println(e.getMessage());
        }
        assertEquals(5,department.getEmployees().size());
    }

    @Test
    @DisplayName("Test for remove method in department for employee if the nurse doesn't exist")
    public void testRemoveForNurseNotExists() {
        Nurse nurse = new Nurse("test","test","test");
        assertEquals(5,department.getEmployees().size());
        try {
            department.remove(nurse);
        }
        catch (RemoveException e){
            System.out.println(e.getMessage());
        }
        assertEquals(5,department.getEmployees().size());
    }

    @Test
    @DisplayName("Test for remove method in department for employee if the generalPractitioner doesn't exist")
    public void testRemoveForGeneralPractitionerNotExists() {
        GeneralPractitioner generalPractitioner = new GeneralPractitioner("test","test",
                "test");
        assertEquals(5,department.getEmployees().size());
        try {
            department.remove(generalPractitioner);
        }
        catch (RemoveException e){
            System.out.println(e.getMessage());
        }
        assertEquals(5,department.getEmployees().size());
    }
}