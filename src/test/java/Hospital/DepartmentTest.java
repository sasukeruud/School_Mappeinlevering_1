package Hospital;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {

    Department department;

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
        Employee employee = new Employee("test","test","test");
        department.addEmployee(employee);
        //Checks that it's the same object
        assertEquals(department.getEmployees().get(0),employee);
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
        Patient patient = new Patient("test","test","test");
        department.addPatient(patient);
        //Checks that it's the same object
        assertEquals(department.getPatients().get(0),patient);
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

}