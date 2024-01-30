package org.rd.lessons.lessons11_OOPGirisHW8;

import java.time.LocalDate;

public class Erkek extends Personel{
    public Erkek(String firstName, String lastName, LocalDate dateOfBirth, Department department) {
        super(firstName, lastName, dateOfBirth, department);
    }
}
