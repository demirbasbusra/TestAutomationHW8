package org.rd.lessons.lessons11_OOPGirisHW8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Department {
    private TeamLead teamLead;
    private List<Personel> personnelList;
    private List<String> assignmentList;

    public Department(String teamLeadName) {
        this.teamLead = new TeamLead(teamLeadName, this);
        this.personnelList = new ArrayList<>();
        this.assignmentList = new ArrayList<>();
    }

    public void changeTeamLead(String newTeamLeadName) {
        this.teamLead = new TeamLead(newTeamLeadName, this);
    }

    public void addStaff(Personel personel) {
        personnelList.add(personel);
    }

    public void removeStaff(Personel personnel) {
        personnelList.remove(personnel);
    }

    public void changeStaff(Personel oldPersonnel, String newFirstName, String newLastName, LocalDate newDateOfBirth) {
        oldPersonnel.setFirstName(newFirstName);
        oldPersonnel.setLastName(newLastName);
        oldPersonnel.setDateOfBirth(newDateOfBirth);
    }

    public void addTask(String taskDescription) {
        assignmentList.add(taskDescription);
    }

    public void markTaskAsCompleted(String taskDescription) {
        assignmentList.remove(taskDescription);
    }


}
