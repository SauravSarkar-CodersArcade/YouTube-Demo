package com.bms.mca.basics;
public class Student {
    String name;
    String email;
    int rollNo;
    static final String college = "BMSIT";
    public Student(String name, String email, int rollNo){
        this.name = name;
        this.email = email;
        this.rollNo = rollNo;
    }
    void studentDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Email: " + this.email);
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("College: " + college);
    }
    public static void main(String[] args) {
        // Classname obj = new Classname();
        Student s1 = new Student("Yash", "yash@gmail.com", 23);
        s1.studentDetails();
        Student s2 = new Student("Yashwanth", "yash@gmail.com", 23);
        s2.studentDetails();
    }
}
