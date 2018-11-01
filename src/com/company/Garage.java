package com.company;

import java.util.List;

public class Garage {
    List<Vehicule> voitures;

    public Garage(List<Vehicule> voitures){
        this.voitures = voitures;
    }

    public Garage(){

    }

    public String toString() {
        return "";
    }

    public void addVoiture( Vehicule voit){
        voitures.add(voit);
    }
}
