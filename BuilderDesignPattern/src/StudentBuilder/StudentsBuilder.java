package StudentBuilder;

import java.util.List;

public abstract class StudentsBuilder {
    long roll_No;
    String student_Name;
    String fatherName;
    String motherName;
    List<String> subject;

    public void setStudent_Name(String student_Name) {
        this.student_Name = student_Name;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setRoll_No(long roll_No) {
        this.roll_No = roll_No;
    }

    abstract public StudentsBuilder setSubjects();

    public Student build(){
        return  new Student(this);
    }
}
