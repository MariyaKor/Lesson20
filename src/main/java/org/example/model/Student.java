package org.example.model;

public class Student {

    private int id;
    private String studentRecordName;
    private String email;
    private String formOfAdmission;
    private int groupNumber;
    private int cityId;

    public void setId(int id) {
        this.id = id;
    }

    public void setStudentRecordName(String studentRecordName) {
        this.studentRecordName = studentRecordName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFormOfAdmission(String formOfAdmission) {
        this.formOfAdmission = formOfAdmission;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentRecordName='" + studentRecordName + '\'' +
                ", email='" + email + '\'' +
                ", formOfAdmission='" + formOfAdmission + '\'' +
                ", groupNumber=" + groupNumber +
                ", cityId=" + cityId +
                '}';
    }

}
