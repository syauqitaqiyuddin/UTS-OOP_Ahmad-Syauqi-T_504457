import java.util.ArrayList;
import java.util.List;
public class Chart {
    protected List<Subject> subjects = new ArrayList<>();

    public void addChart(Subject subject) {
        subjects.add(subject);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public String getCurrentChart() {
        return null;
    }

    @Override
    public String toString() {
        return getCurrentChart();
    }
}






