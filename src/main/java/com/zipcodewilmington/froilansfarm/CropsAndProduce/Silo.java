package com.zipcodewilmington.froilansfarm.CropsAndProduce;
import java.util.ArrayList;

public class Silo {
    private ArrayList<Tomato> silo1;
    private ArrayList<EarCorn> silo2;
    private ArrayList<RiceGrain>  silo3;

    public Silo() {
        this.silo1 = new ArrayList<>();
        this.silo2 = new ArrayList<>();
        this.silo3 = new ArrayList<>();
    }

    public void addTomato(Tomato tomato) {silo1.add(tomato);
    }

    public void addEarCorn(EarCorn earCorn) {silo2.add(earCorn);
    }

    public void addRiceGrain(RiceGrain riceGrain) {silo3.add(riceGrain);
    }
}

