import Hospital.Patient;
import Hospital.Person;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PatientTest{

    Patient patient;

    @BeforeAll
    static void beforeAll(){
        System.out.println("-------------------------------------------------------------");
        System.out.println("Tests for Hospital.Patient class");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("All tests for Hospital.Patient class is completed");
        System.out.println("-------------------------------------------------------------");
    }

    @BeforeEach
    void beforeEach(){
        patient = new Patient("test","test","test");
    }

    @Test
    @DisplayName("Test for creating a patient if correct")
    public void testCreatPatientCorrect(){
        assertEquals("test",patient.getFirstName());
        assertEquals("test", patient.getLastName());
        assertEquals("test", patient.getPersonNumber());
        assertNotNull(patient);
    }

    @Test
    @DisplayName("Test for setter and getter for diagnosis if true")
    public void testSetterAndGetterIfTrue(){
        patient.setDiagnosis("test");
        assertEquals("test", patient.getDiagnosis());
    }

    @Test
    @DisplayName("Test for setter and getter for diagnosis if false")
    public void testSetterAndGetterIfFalse(){
        patient.setDiagnosis("test");
        assertNotEquals("False",patient.getDiagnosis());
    }

}