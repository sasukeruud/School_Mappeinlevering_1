package Hospital;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class NurseTest {


    Nurse nurse;

    @BeforeAll
    static void beforeAll(){
        System.out.println("-------------------------------------------------------------");
        System.out.println("Tests for Hospital.Nurse class");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("All tests for Hospital.Nurse class is completed");
        System.out.println("-------------------------------------------------------------");
    }

    @BeforeEach
    void beforeEach(){
        nurse = new Nurse("test","test","test");
    }

    @Test
    @DisplayName("Test for creating a patient if correct")
    public void testCreatPatientCorrect(){
        assertEquals("test", nurse.getFirstName());
        assertEquals("test", nurse.getLastName());
        assertEquals("test", nurse.getPersonNumber());
        assertNotNull(nurse);
    }

}