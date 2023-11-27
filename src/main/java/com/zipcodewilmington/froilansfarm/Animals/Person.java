package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Utilities.Rider;

public abstract class Person implements Animal, Rider {
    public abstract boolean mount(Horse rideable);

    public abstract boolean dismount(Horse rideable);
}
