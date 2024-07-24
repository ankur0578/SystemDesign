package StudentBuilder;

import java.util.ArrayList;
import java.util.List;

public class MbaStudents extends StudentsBuilder{
    @Override
    public StudentsBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("Economics");
        subs.add("Computation");
        this.subject = subs;
        return this;
    }
}
