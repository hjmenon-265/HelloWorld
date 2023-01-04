package com.hari;

public class Student {
    int age;
    Gender studentGender;
    public Student(int x, Gender y) {
        this.age = x;
        this.studentGender = y;
    }
    public void addAge(int x) {
        this.age += x;
    }
    public void changeGender(Gender y) {
        switch (y) {
            case MALE -> {
                this.studentGender = Gender.FEMALE;
            }
            case FEMALE -> {
                this.studentGender=Gender.MALE;
            }
            default -> throw new IllegalStateException("Unexpected value: " + y);
        }
    }
}
