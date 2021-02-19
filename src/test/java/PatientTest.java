import Hospital.Patient;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PatientTest{

    Patient person;

    @BeforeAll
    static void beforeAll(){
        System.out.println("Tests for Hospital.Patient class");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("All tests for Hospital.Patient class is completed");
    }

    @BeforeEach
    void beforeEach(){
        person = new Patient("test","test","test");
    }

    @Test
    @DisplayName("Test for setter and getter for diagnosis")
    public void testSetterAndGetter(){
        person.setDiagnosis("test");
        assertEquals("test",person.getDiagnosis());
    }

}