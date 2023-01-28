package com.enternodecs.npcgenerator;

public class NPC {
    private String firstName;
    private String lastName;
    private Race race;
    private String homeland;

    public NPC(String firstName, String lastName, Race race, String homeland) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.race = race;
        this.homeland = homeland;
    }

    @Override
    public String toString() {
        return "NPC{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", race='" + race + '\'' +
                ", homeland='" + homeland + '\'' +
                '}';
    }
}
