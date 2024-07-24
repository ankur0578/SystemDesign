import StudentBuilder.EngineeringStudent;
import StudentBuilder.Student;
import StudentBuilder.StudentDirector;

public class StudentClient {
    public static void main(String[] args) {
        StudentDirector engDirector = new StudentDirector(new EngineeringStudent());
        Student engStudent = engDirector.createStudent();
        System.out.println(engStudent.toString());
    }
}