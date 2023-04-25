import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student test_student = new Student("jeff",3,"math");

    @Test
    void getName() {
        assertEquals("jeff",test_student.getName());
    }

    @Test
    void getId() {
        assertEquals(3,test_student.getId());
    }
}