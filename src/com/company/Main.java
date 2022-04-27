package com.company;


import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
	pet firstPet = new pet("Sally", "Rodesian Ridgeback", LocalDate.of(2011, Month.JANUARY, 23), pet.typeOfAnimal.DOG);
        System.out.println(firstPet.getName());
        System.out.println(firstPet.returnAge());
        System.out.println(firstPet.getBreed());
        System.out.println(firstPet.isNeedsRestraint());
        System.out.println(firstPet.getType());
    }
}
