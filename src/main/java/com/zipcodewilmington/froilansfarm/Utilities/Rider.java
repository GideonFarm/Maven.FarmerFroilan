package com.zipcodewilmington.froilansfarm.Utilities;

public interface Rider <RideableType extends Rideable>{
    boolean mount();
    boolean dismount();
}
