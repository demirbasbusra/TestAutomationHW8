package org.example;

import org.rd.lessons.lessons11_OOPGirisHW8.Department;
import org.rd.lessons.lessons11_OOPGirisHW8.Erkek;
import org.rd.lessons.lessons11_OOPGirisHW8.Kadin;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Create a department with a team lead
        Department hrDepartment = new Department("DEPARTMENT");

        // Add male staff to the department
        Erkek maleStaff = new Erkek("AHMET", "AHMET", LocalDate.of(1980, 5, 15), hrDepartment);
        hrDepartment.addStaff(maleStaff);

        // Add female staff to the department
        Kadin femaleStaff = new Kadin("AYŞE", "AYŞE", LocalDate.of(1985, 8, 20), hrDepartment);
        hrDepartment.addStaff(femaleStaff);

        // Calculate retirement age for male and female staff
        maleStaff.calculateRetirementAge();
        femaleStaff.calculateRetirementAge();


    }
}