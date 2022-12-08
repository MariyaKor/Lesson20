package org.example.service;
import org.example.model.Student;
import java.util.List;

public interface DataBaseWorker {

    List<Student> getStudents() throws ClassNotFoundException;

}
