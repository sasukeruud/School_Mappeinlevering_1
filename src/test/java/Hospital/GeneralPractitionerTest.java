package Hospital;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GeneralPractitionerTest {

    GeneralPractitioner generalPractitioner;

    @BeforeAll
    static void beforeAll(){
        System.out.println("-------------------------------------------------------------");
        System.out.println("Tests for Hospital.GeneralPractitioner class");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("All tests for Hospital.GeneralPractitioner class is completed");
        System.out.println("-------------------------------------------------------------");
    }

    @BeforeEach
    void beforeEach(){
        generalPractitioner = new GeneralPractitioner("test","test",
                "test");
    }

    @Test
    @DisplayName("Test for creating a patient if correct")
    public void testCreatPatientCorrect(){
        assertEquals("test", generalPractitioner.getFirstName());
        assertEquals("test", generalPractitioner.getLastName());
        assertEquals("test", generalPractitioner.getPersonNumber());
        assertNotNull(generalPractitioner);
    }

    @Test
    @DisplayName("Test for setting diagnosis for patient by GeneralPractitioner working")
    public void testSetDiagnosisTrue(){
        Patient patient = new Patient("Test","test","Test");
        generalPractitioner.setDiagnosis(patient,"test");
        assertEquals("test", patient.getDiagnosis());
    }

    @Test
    @DisplayName("Test for setting diagnosis for patient by GeneralPractitioner if wrong")
    public void testSetDiagnosisFalse(){
        Patient patient1 = new Patient("Test","test","Test");
        Patient patient2 = new Patient("Test","test","Test");
        generalPractitioner.setDiagnosis(patient1,"test");
        assertNotEquals("test", patient2.getDiagnosis());
    }
}