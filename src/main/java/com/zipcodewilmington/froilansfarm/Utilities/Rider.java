package com.zipcodewilmington.froilansfarm.Utilities;

public interface Rider <RideableType extends Rideable>{
    boolean mount(RideableType rideable);
    boolean dismount(RideableType rideable);
}
