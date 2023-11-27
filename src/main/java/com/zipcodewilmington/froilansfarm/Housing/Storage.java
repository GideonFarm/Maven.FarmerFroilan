package com.zipcodewilmington.froilansfarm.Housing;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Animals.Person;

import java.util.ArrayList;

public class Storage {
    private ArrayList<Horse> stable;
    private ArrayList<Chicken> chickenCoop;
    private ArrayList<Person> farmHouse;

    public Storage() {
        this.stable = new ArrayList<>();
        this.chickenCoop = new ArrayList<>();
        this.farmHouse = new ArrayList<>();
    }

    public void addHorse(Horse horse) {
        stable.add(horse);
    }

    public void addChicken(Chicken chicken) {
        chickenCoop.add(chicken);
    }

    public void addPerson(Person person) {
        farmHouse.add(person);
    }

    public int getStableSize() {
        return stable.size();
    }

    public int getChickenCoopSize() {
        return chickenCoop.size();
    }

    public int getFarmHouseSize() {
        return farmHouse.size();
    }
}

