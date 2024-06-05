package com.manishjangra.studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ask how many new students we want to add

        System.out.print("Enter Number of New Students to be Enrolled: ");
        int stdNum = sc.nextInt();

        Student[] students = new Student[stdNum];
        //create a number of new students
        for (int i = 0; i < stdNum; i++){
            System.out.println("===== Details of Student "+(i+1)+" =====");
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();

        }
        for(int i = 0; i < stdNum; i++){
            System.out.println("\n"+students[i].toString());
        }
    }
}