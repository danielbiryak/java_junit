package com.main;

public class Student {
    private Integer Age;
    private Integer Mark;
    private String Name;

    public Student(Integer age, Integer mark, String name) {
        Age = age;
        Mark = mark;
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Integer getMark() {
        return Mark;
    }

    public void setMark(Integer mark) {
        Mark = mark;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public static void main(String[] args) {
        System.out.println((new Double("26.33333")).getClass());
    }
}