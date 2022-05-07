package com.main;

import java.util.List;

public class StudentService {
    List<Student> Students;

    public StudentService(List<Student> students) {
        this.Students = students;
    }

    public List<Student> getStudents() {
        return this.Students;
    }

    public Integer averageAge() {
        Integer sumUp = 0;
        for (Student student : this.Students)
            sumUp += student.getAge();
        Integer size = this.Students.size();
        return sumUp / size;
    }

    public Double averageMark() {
        Integer sumUp = 0;
        for (Student student : this.Students)
            sumUp += student.getMark();
        Integer size = this.Students.size();
        double result = (double) sumUp / (double) size;

        return (double) Math.round(result * 100) / (double) 100;
    }
}
