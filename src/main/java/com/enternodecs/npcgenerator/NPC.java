package com.enternodecs.npcgenerator;

public class NPC {
    private String firstName;
    private String lastName;
    private String race;
    private String subrace;
    private String homeland;

    public NPC(String firstName, String lastName, String race, String subrace, String homeland) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.race = race;
        this.subrace = subrace;
        this.homeland = homeland;
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

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getSubrace() {
        return subrace;
    }

    public void setSubrace(String subrace) {
        this.subrace = subrace;
    }

    public String getHomeland() {
        return homeland;
    }

    public void setHomeland(String homeland) {
        this.homeland = homeland;
    }

    @Override
    public String toString() {
        return "NPC{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", race='" + race + '\'' +
                ", subrace='" + subrace + '\'' +
                ", homeland='" + homeland + '\'' +
                '}';
    }
}
