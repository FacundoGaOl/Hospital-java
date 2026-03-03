package org.hospital;

public abstract class Character {
    private String name;
    private String specialConditions;

    public Character(String name, String specialConditions) {
        this.name = name;
        this.specialConditions = specialConditions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialConditions() {
        return specialConditions;
    }

    public void setSpecialConditions(String specialConditions) {
        this.specialConditions = specialConditions;
    }
}
