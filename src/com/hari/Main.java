package com.hari;
enum Gender {
    MALE, FEMALE};
public class Main {

    public static void main(String[] args) {
        int age =30;
        Gender input_gender=Gender.MALE;
//testing Git Sync ddgit2
        Student hari = new Student(age, input_gender);
        System.out.println("original age is "+hari.age);
        System.out.println("original gender is " +hari.studentGender);
        hari.addAge(10);
        hari.changeGender(hari.studentGender);
        System.out.println("new age is "+ hari.age);
        System.out.println("new gender is "+hari.studentGender);

    }
}
