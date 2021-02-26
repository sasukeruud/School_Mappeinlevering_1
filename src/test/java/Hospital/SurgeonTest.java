package Hospital;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SurgeonTest {


    Surgeon surgeon;

    @BeforeAll
    static void beforeAll(){
        System.out.println("-------------------------------------------------------------");
        System.out.println("Tests for Hospital.Surgeon class");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("All tests for Hospital.Surgeon class is completed");
        System.out.println("-------------------------------------------------------------");
    }

    @BeforeEach
    void beforeEach(){
        surgeon = new Surgeon("test","test",
                "test");
    }

    @Test
    @DisplayName("Test for creating a patient if correct")
    public void testCreatPatientCorrect(){
        assertEquals("test", surgeon.getFirstName());
        assertEquals("test", surgeon.getLastName());
        assertEquals("test", surgeon.getPersonNumber());
        assertNotNull(surgeon);
    }

    @Test
    @DisplayName("Test for setting diagnosis for patient by GeneralPractitioner working")
    public void testSetDiagnosisTrue(){
        Patient patient = new Patient("Test","test","Test");
        surgeon.setDiagnosis(patient,"test");
        assertEquals("test", patient.getDiagnosis());
    }

    @Test
    @DisplayName("Test for setting diagnosis for patient by GeneralPractitioner if wrong")
    public void testSetDiagnosisFalse(){
        Patient patient1 = new Patient("Test","test","Test");
        Patient patient2 = new Patient("Test","test","Test");
        surgeon.setDiagnosis(patient1,"test");
        assertNotEquals("test", patient2.getDiagnosis());
    }

}