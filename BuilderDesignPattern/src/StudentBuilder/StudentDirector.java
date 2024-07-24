package StudentBuilder;

public class StudentDirector {
    StudentsBuilder studentsBuilder;
    public StudentDirector(StudentsBuilder studentsBuilder1){
        this.studentsBuilder = studentsBuilder1;
    }
    public Student createStudent(){
        if(studentsBuilder instanceof EngineeringStudent){
            return createEngineeringStudent();
        } else if (studentsBuilder instanceof  MbaStudents) {
            return createMbaStudent();
        }
        return null;
    }

    public Student createEngineeringStudent(){
     studentsBuilder.setRoll_No(1);
     studentsBuilder.setFatherName("rajesh");
     studentsBuilder.setStudent_Name("ankur");
     return studentsBuilder.build();
    }
    public Student createMbaStudent(){
        studentsBuilder.setRoll_No(1);
        studentsBuilder.setFatherName("rajesh");
        studentsBuilder.setStudent_Name("ankur");
        return studentsBuilder.build();
    }
}
