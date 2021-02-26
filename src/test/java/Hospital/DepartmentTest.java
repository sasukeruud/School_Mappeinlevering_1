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

}