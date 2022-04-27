package com.company;

import java.time.LocalDate;


public class pet{

    private typeOfAnimal type;
    private String name;
    private String breed;
    private LocalDate dateOfBirth;
    private boolean needsRestraint;
    public enum typeOfAnimal{
        CAT, DOG, CHICKEN
    }

    public pet(String name, String breed, LocalDate dateOfBirth, pet.typeOfAnimal type) {

        this.name = name;
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
        this.type = type;

    }

    public typeOfAnimal getType() {
        return type;
    }

    public LocalDate getBirthdate() {
        return dateOfBirth;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.dateOfBirth = birthdate;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNeedsRestraint(boolean needsRestraint) {
        this.needsRestraint = needsRestraint;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public boolean isNeedsRestraint() {
        return returnAge() < 13;
    }

    public int returnAge() {
        return LocalDate.now().getYear() - dateOfBirth.getYear();
    }

    @Override
    public String toString() {
        return "pet{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", needsRestraint=" + needsRestraint +
                '}';
    }

}


