package StudentBuilder;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudent extends StudentsBuilder {
    @Override
    public StudentsBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("DSA");
        subs.add("java");
        this.subject = subs;
        return this;
    }
}

