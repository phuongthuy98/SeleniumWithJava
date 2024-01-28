package day5.OOP;

import java.util.Scanner;

public class SinhVien {
    String studentID;
    String studentName;
    String dateOfBirth;
    String sex;

    public void inThongTin() {
        System.out.println("*******************************");
        System.out.println("Student information:");
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Date Of Birth: " + dateOfBirth);
        System.out.println("Sex: " + sex);
    }

    public void nhapThongTin() {
        System.out.println("*******************************");
        Scanner scan = new Scanner(System.in);
        System.out.println("Input id:");
        studentID = scan.nextLine();
        System.out.println("Input name:");
        studentName = scan.nextLine();
        System.out.println("Input date of birth:");
        dateOfBirth = scan.nextLine();
        System.out.println("Input sex:");
        sex = scan.nextLine();
    }
}
