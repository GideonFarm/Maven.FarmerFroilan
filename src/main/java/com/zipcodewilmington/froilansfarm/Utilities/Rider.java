package com.zipcodewilmington.froilansfarm.Utilities;

public interface Rider <RideableType extends Rideable>{
    <T> boolean mount(T rideable);

    <T> boolean dismount(T rideable);
}
