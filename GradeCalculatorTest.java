import org.junit.Test;
import static org.junit.Assert.*;

public class GradeCalculatorTest {

    private final GradeCalculator calculator = new GradeCalculator();

    @Test
    public void testGradeA() {
        assertEquals("A", calculator.gradeOf(100));
        assertEquals("A", calculator.gradeOf(80));
    }

    @Test
    public void testGradeBPlus() {
        assertEquals("B+", calculator.gradeOf(79));
        assertEquals("B+", calculator.gradeOf(75));
    }

    @Test
    public void testGradeB() {
        assertEquals("B", calculator.gradeOf(74));
        assertEquals("B", calculator.gradeOf(70));
    }

    @Test
    public void testGradeCPlus() {
        assertEquals("C+", calculator.gradeOf(69));
        assertEquals("C+", calculator.gradeOf(65));
    }

    @Test
    public void testGradeC() {
        assertEquals("C", calculator.gradeOf(64));
        assertEquals("C", calculator.gradeOf(60));
    }

    @Test
    public void testGradeDPlus() {
        assertEquals("D+", calculator.gradeOf(59));
        assertEquals("D+", calculator.gradeOf(55));
    }

    @Test
    public void testGradeD() {
        assertEquals("D", calculator.gradeOf(54));
        assertEquals("D", calculator.gradeOf(50));
    }

    @Test
    public void testGradeF() {
        assertEquals("F", calculator.gradeOf(49));
        assertEquals("F", calculator.gradeOf(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testScoreBelowZeroThrowsException() {
        calculator.gradeOf(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testScoreAboveHundredThrowsException() {
        calculator.gradeOf(101);
    }
}
