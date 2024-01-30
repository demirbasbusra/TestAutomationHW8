package org.rd.lessons.lessons11_OOPGirisHW8;

import java.time.LocalDate;
import java.time.Period;

public abstract class Personel {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private Department department;

    public Personel(String firstName, String lastName, LocalDate dateOfBirth, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
    }

    public void calculateRetirementAge() {
        // Default retirement age
        int retirementAge = 65;

        if (this instanceof Kadin) {
            retirementAge = 60;
        }

        LocalDate currentDate = LocalDate.now();
        LocalDate retirementDate = dateOfBirth.plusYears(retirementAge);

        Period period = Period.between(currentDate, retirementDate);
        int yearsToRetirement = period.getYears();
        int monthsToRetirement = period.getMonths();
        int daysToRetirement = period.getDays();

        System.out.println("Years to retirement: " + yearsToRetirement + " years, " +
                "Months to retirement: " + monthsToRetirement + " months, " +
                "Days to retirement: " + daysToRetirement + " days");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}


