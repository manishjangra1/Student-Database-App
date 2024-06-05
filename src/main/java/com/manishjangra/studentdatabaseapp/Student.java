package com.manishjangra.studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = null;
    private int tuitionBalance =0;
    private static final int costOfCourse =600;
    private static int id = 1000;

    //Constructor to prompt user to enter student's name and year
    public Student(){
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter the First Name of the Student: ");
        this.firstName = in.nextLine();
        System.out.print("Enter the Last Name of the Student: ");
        this.lastName = in.nextLine();
        System.out.print(" 1- First Year\n 2- Second Year\n 3- Third Year\n 4- Fourth Year\n Enter the Grade Year of the Student: ");
        this.gradeYear = in.nextInt();

        setStudentId();
    }

    //Generate an ID
    private void setStudentId(){
        //Grade Level + ID
        id++;
        this.studentId = gradeYear +""+ id;

    }

    // Enroll in courses
    public void enroll(){
        //Get inside a loop
        do {
            System.out.print("Enter the course to be enrolled (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equalsIgnoreCase("Q")){
                this.courses = courses +"\n "+ course;
                tuitionBalance += costOfCourse;
            }
            else {
                break;
            }
        }while (true);
    }

    //View Balance
    public void viewBalance(){
        System.out.println("Your balance is: $"+tuitionBalance);

    }

    //Pay Tuition
    public void payTuition(){
        viewBalance();
        Scanner in = new Scanner(System.in);
        System.out.print("Do you want to pay tuitionFee? (Y/N): ");
        String response = in.nextLine();
        if(response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("YES")){
            System.out.print("Enter the amount you want to pay: $");
            int payment = in.nextInt();
            tuitionBalance -= payment;
            System.out.println("ThankYou for the payment of $"+payment);
            viewBalance();
        }
        else {
            viewBalance();
            System.out.print("Please pay as soon as possible!");
            System.out.println("ENROLLMENT ABORTED!");
        }


    }
    //Show Status
    public String toString(){
        return "\nName: "+firstName+" "+lastName+
                "\nGrade Year: "+gradeYear+
                "\nStudent ID: "+studentId+
                "\nCourses Enrolled: "+courses+
                "\nTuition Balance: $"+tuitionBalance;
    }
}
