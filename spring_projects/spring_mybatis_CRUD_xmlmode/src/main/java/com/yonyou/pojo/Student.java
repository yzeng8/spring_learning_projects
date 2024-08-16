package com.yonyou.pojo;

public class Student {
    private String studentName;
    private Integer studentId;
    private String sex;

//    public Student(String studentName, String sex) {
//        this.sex = sex;
//        this.studentName = studentName;
//    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "student{" +
                "studentName='" + studentName + '\'' +
                ", studentId=" + studentId +
                ", sex='" + sex + '\'' +
                '}';
    }
}
