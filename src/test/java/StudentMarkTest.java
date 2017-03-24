import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Robin on 24/03/2017.
 */
public class StudentMarkTest {
    @Test
    public void should_return_false() throws Exception {
        Student student = new Student("toto", "tata");
        StudentMark mark = new StudentMark(student, 22.5, "maths");

        assertFalse(mark.isValid());
    }

    @Test
    public void should_return_true() throws Exception {
        Student student = new Student("toto", "tata");
        StudentMark mark = new StudentMark(student, 15.8, "maths");

        assertTrue(mark.isValid());
    }

}