package service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StudentService {

    @Test
    void additionTest() {
        int a = 10;
        int b = 20;

        int result = a + b;

        assertEquals(30, result);
    }

    @Test
    void studentNameTest() {
        String studentName = "Rahul";

        assertEquals("Rahul", studentName);
    }

    @Test
    void studentNameShouldNotBeEmpty() {
        String studentName = "Rahul";

        assertTrue(studentName != null && !studentName.isEmpty());
    }
}