package pojo;

public class Student {
    private Integer student_ID;
    private String student_name;
    private String sex;

    public Integer getStudent_ID() {
        return student_ID;
    }

    public void setStudent_ID(Integer student_ID) {
        this.student_ID = student_ID;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_ID=" + student_ID +
                ", student_name='" + student_name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}


