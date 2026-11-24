package test;
import org.junit.Test;

import src.GradeCalculator;

import static org.junit.Assert.*;

public class GradeCalculatorTest {

    private final GradeCalculator calculator = new GradeCalculator();

    @Test
    public void testGradeA() {
        assertEquals("A", calculator.gradeOf(100)); // TC-001
        assertEquals("A", calculator.gradeOf(90));  // TC-019
        assertEquals("A", calculator.gradeOf(80));  // TC-002
    }

    @Test
    public void testGradeBPlus() {
        assertEquals("B+", calculator.gradeOf(79)); // TC-003
        assertEquals("B+", calculator.gradeOf(75)); // TC-004
    }

    @Test
    public void testGradeB() {
        assertEquals("B", calculator.gradeOf(74)); // TC-005
        assertEquals("B", calculator.gradeOf(72)); // TC-020
        assertEquals("B", calculator.gradeOf(70)); // TC-006
    }

    @Test
    public void testGradeCPlus() {
        assertEquals("C+", calculator.gradeOf(69)); // TC-007
        assertEquals("C+", calculator.gradeOf(65)); // TC-008
    }

    @Test
    public void testGradeC() {
        assertEquals("C", calculator.gradeOf(64)); // TC-009
        assertEquals("C", calculator.gradeOf(62)); // TC-021
        assertEquals("C", calculator.gradeOf(60)); // TC-010
    }

    @Test
    public void testGradeDPlus() {
        assertEquals("D+", calculator.gradeOf(59)); // TC-011
        assertEquals("D+", calculator.gradeOf(55)); // TC-012
    }

    @Test
    public void testGradeD() {
        assertEquals("D", calculator.gradeOf(54)); // TC-013
        assertEquals("D", calculator.gradeOf(52)); // TC-022
        assertEquals("D", calculator.gradeOf(50)); // TC-014
    }

    @Test
    public void testGradeF() {
        assertEquals("F", calculator.gradeOf(49)); // TC-015
        assertEquals("F", calculator.gradeOf(20)); // TC-023
        assertEquals("F", calculator.gradeOf(0));  // TC-016
    }

    @Test(expected = IllegalArgumentException.class)
    public void testScoreBelowZeroThrowsException() {
        calculator.gradeOf(-1); // TC-017
    }

    @Test(expected = IllegalArgumentException.class)
    public void testScoreAboveHundredThrowsException() {
        calculator.gradeOf(101); // TC-018
    }

    // TC-024 (Regression): หลัง Refactor ให้รันเทสต์ทั้งคลาสนี้ซ้ำ ทุกเทสต์ต้องยังผ่าน
}