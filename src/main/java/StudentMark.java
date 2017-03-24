/**
 * Created by Robin on 24/03/2017.
 */
public class StudentMark {
    private Student student;
    private double mark;
    private String topic;

    public StudentMark(Student student, double mark, String topic) {
        this.student = student;
        this.mark = mark;
        this.topic = topic;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public boolean isValid() {
        if (mark <= 20 && mark >= 0)
            return true;
        return false;
    }
}
