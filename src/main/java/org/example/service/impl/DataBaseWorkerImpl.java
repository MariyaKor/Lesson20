package org.example.service.impl;

import org.example.model.Student;
import org.example.service.DataBaseWorker;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataBaseWorkerImpl implements DataBaseWorker {
    String getStudentsQuery = "select*from public.students";
    String url = "jdbc:postgresql://localhost:5432/postgres";
    String user = "postgres";
    String password = "1";

    public List<Student> getStudents() throws ClassNotFoundException {
        List<Student> studentsList = new ArrayList<>();
        Class.forName("org.postgresql.Driver");
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            PreparedStatement pst = con.prepareStatement(getStudentsQuery);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Student st = new Student();
                st.setId(rs.getInt("id"));
                st.setStudentRecordName(rs.getString("studentrecordname"));
                st.setEmail(rs.getString("email"));
                st.setFormOfAdmission(rs.getString("formOfAdmission"));
                st.setGroupNumber(rs.getInt("groupNumber"));
                st.setCityId(rs.getInt("city_id"));
                studentsList.add(st);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return studentsList;
    }
}
