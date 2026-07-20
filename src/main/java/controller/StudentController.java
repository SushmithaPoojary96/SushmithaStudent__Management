package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Student;
import service.StudentService;

@WebServlet("/StudentController")
public class StudentController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    StudentService service = new StudentService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        if (action == null) {
            action = "list";
        }

        switch (action) {

        case "list":

            List<Student> students = service.getAllStudents();

            request.setAttribute("students", students);

            request.getRequestDispatcher("viewStudents.jsp")
                   .forward(request, response);

            break;

        case "delete":

            String deleteId = request.getParameter("id");

            service.deleteStudent(deleteId);

            response.sendRedirect("StudentController?action=list");

            break;

        case "edit":

            String editId = request.getParameter("id");

            Student student = service.getStudentById(editId);

            request.setAttribute("student", student);

            request.getRequestDispatcher("editStudent.jsp")
                   .forward(request, response);

            break;

        default:

            response.sendRedirect("StudentController?action=list");

        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        if ("add".equals(action)) {

            Student student = new Student();

            student.setName(request.getParameter("name"));
            student.setEmail(request.getParameter("email"));
            student.setCourse(request.getParameter("course"));

            service.addStudent(student);
            System.out.println("Git triggering");

            response.sendRedirect("StudentController?action=list");

        }

        else if ("update".equals(action)) {

            Student student = new Student();

            student.setId(request.getParameter("id"));
            student.setName(request.getParameter("name"));
            student.setEmail(request.getParameter("email"));
            student.setCourse(request.getParameter("course"));

            service.updateStudent(student);

            response.sendRedirect("StudentController?action=list");
        }

    }

}