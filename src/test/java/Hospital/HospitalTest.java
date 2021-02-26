package Hospital;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class HospitalTest {

    Hospital hospital;

    @BeforeAll
    static void beforeAll(){
        System.out.println("-------------------------------------------------------------");
        System.out.println("Tests for Hospital.Hospital class");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Tests for Hospital.Hospital class is completed");
        System.out.println("-------------------------------------------------------------");
    }

    @BeforeEach
    void beforeEach(){
        hospital = new Hospital("test");
    }

    @Test
    @DisplayName("Test for adding new department if correct")
    public void testAddDepartmentIfCorrect(){
        Department test = new Department("Test");
        hospital.addDepartment(test);
        assertEquals("Test",hospital.getDepartments().get(0).getDepartmentName());
        assertNotEquals("feil",hospital.getDepartments().get(0).getDepartmentName());
    }

    @Test
    @DisplayName("Test for adding new department if wrong")
    public void testAddDepartmentIfWrong(){
        Department test = new Department("Test");
        hospital.addDepartment(test);
        assertEquals("Test",hospital.getDepartments().get(0).getDepartmentName());
        assertNotEquals("feil",hospital.getDepartments().get(0).getDepartmentName());
    }

    @Test
    @DisplayName("Test for creating hospital")
    public void testHospitalCreated(){
        assertEquals("test",hospital.getHospitalName());
        assertNotEquals("Wrong",hospital.getHospitalName());
    }

}