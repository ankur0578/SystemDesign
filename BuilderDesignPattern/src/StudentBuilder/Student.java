package StudentBuilder;

import java.util.List;

public class Student {
    long roll_No;
    String student_Name;
    String fatherName;
    String motherName;
    List<String> subject;

    public  Student(StudentsBuilder studentBuilder){
        this.roll_No = studentBuilder.roll_No;
        this.fatherName=studentBuilder.fatherName;
        this.motherName=studentBuilder.motherName;
        this.subject=studentBuilder.subject;
        this.student_Name= studentBuilder.student_Name;
    }

    public String toString(){
        return  "" +
                "Roll Number" + roll_No +
                "Student Name" + student_Name;
    }
}
