package com.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StudentTest {

    StudentService studentService;

    @BeforeClass
    public static void globalSetup() {
        System.out.println("Initial setup...");
        System.out.println("Code executes only once"); 
        
    }

    @Before
    public void setUp() {
        System.out.println("Code executes before each test method");
        Student student1 = new Student(22, 4, "Dave");
        Student student2 = new Student(32, 2, "Steven");
        Student student3 = new Student(25, 4, "Felix");

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentService = new StudentService(studentsList);
    }

    @Test
    public void whenCreateNewStudentThenReturnListWithNewStudent() {
        assertEquals(3, studentService.getStudents().size());
        studentService.getStudents().add(new Student(25, 5, "Steve"));
        assertEquals(4, studentService.getStudents().size());
    }

    @Test
    public void averageAgeMethodAccuracy() {
        assertEquals(new Integer(26), studentService.averageAge());
        assertNotEquals(new Double(26.0), studentService.averageAge());
        assertNotEquals(new Double(26.3), studentService.averageAge());
    }

    @Test
    public void averageMarkMethodAccuracy() {
        assertEquals(new Double(3.33), studentService.averageMark());
        assertNotEquals(new Double(3), studentService.averageMark());
        assertNotEquals(new Double(3.3), studentService.averageMark());
    }
    @Test
    public void failedTestNumber1(){
        assertEquals(4, studentService.getStudents().size());
        studentService.getStudents().add(new Student(1, 1, "a"));
        assertEquals(3, studentService.getStudents().size());
    }
    @Test
    public void failedTestNumber2(){
        assertEquals(4, studentService.getStudents().size());
        studentService.getStudents().add(new Student(1, 1, "a"));
        assertEquals(3, studentService.getStudents().size());
    }
    @Test
    public void failedTestNumber3(){
        assertEquals(4, studentService.getStudents().size());
        studentService.getStudents().add(new Student(1, 1, "a"));
        assertEquals(3, studentService.getStudents().size());
    }
}
