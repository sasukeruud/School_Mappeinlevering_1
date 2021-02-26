package Hospital;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    Employee employee;

    @BeforeAll
    static void beforeAll(){
        System.out.println("-------------------------------------------------------------");
        System.out.println("Tests for Hospital.Employee class");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("All tests for Hospital.Employee class is completed");
        System.out.println("-------------------------------------------------------------");
    }

    @BeforeEach
    void beforeEach(){
        employee = new Employee("test","test","test");
    }

    @Test
    @DisplayName("Test for creating a patient if correct")
    public void testCreatPatientCorrect(){
        assertEquals("test", employee.getFirstName());
        assertEquals("test", employee.getLastName());
        assertEquals("test", employee.getPersonNumber());
        assertNotNull(employee);
    }

}