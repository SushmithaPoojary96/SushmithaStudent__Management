package dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.types.ObjectId;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

import model.Student;
import util.MongoDBConnection;

public class StudentDAO {

    private MongoDatabase database;
    private MongoCollection<Document> collection;

    public StudentDAO() {
        database = MongoDBConnection.getDatabase();
        collection = database.getCollection("students");
    }

    // Add Student
    public void addStudent(Student student) {

        Document doc = new Document("name", student.getName())
                .append("email", student.getEmail())
                .append("course", student.getCourse());

        collection.insertOne(doc);
    }

    // View All Students
    public List<Student> getAllStudents() {

        List<Student> studentList = new ArrayList<>();

        for (Document doc : collection.find()) {

            Student student = new Student();

            student.setId(doc.getObjectId("_id").toHexString());
            student.setName(doc.getString("name"));
            student.setEmail(doc.getString("email"));
            student.setCourse(doc.getString("course"));

            studentList.add(student);
        }

        return studentList;
    }

    // Get Student By Id
    public Student getStudentById(String id) {

        Document doc = collection.find(Filters.eq("_id", new ObjectId(id))).first();

        if (doc != null) {

            Student student = new Student();

            student.setId(doc.getObjectId("_id").toHexString());
            student.setName(doc.getString("name"));
            student.setEmail(doc.getString("email"));
            student.setCourse(doc.getString("course"));

            return student;
        }

        return null;
    }

    // Update Student
    public void updateStudent(Student student) {

        Document updatedData = new Document("name", student.getName())
                .append("email", student.getEmail())
                .append("course", student.getCourse());

        Document updateObject = new Document("$set", updatedData);

        collection.updateOne(
                Filters.eq("_id", new ObjectId(student.getId())),
                updateObject);
    }

    // Delete Student
    public void deleteStudent(String id) {

        collection.deleteOne(
                Filters.eq("_id", new ObjectId(id)));
    }

}