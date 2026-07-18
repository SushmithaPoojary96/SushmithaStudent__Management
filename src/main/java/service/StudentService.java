package service;

import java.util.List;

import dao.StudentDAO;
import model.Student;

public class StudentService {

    StudentDAO dao = new StudentDAO();

    // Add Student
    public void addStudent(Student student) {
        dao.addStudent(student);
    }

    // View All Students
    public List<Student> getAllStudents() {
        return dao.getAllStudents();
    }

    // Get Student By ID
    public Student getStudentById(String id) {
        return dao.getStudentById(id);
    }

    // Update Student
    public void updateStudent(Student student) {
        dao.updateStudent(student);
    }

    // Delete Student
    public void deleteStudent(String id) {
        dao.deleteStudent(id);
    }
}