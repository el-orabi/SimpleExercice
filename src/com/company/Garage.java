package com.company;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    List<Vehicule> voitures = new ArrayList<Vehicule>();

    public Garage(){
        System.out.println("********************************");
        System.out.println("* garage el orabi system blida *");
        System.out.println("********************************");
    }

    @Override
    public String toString() {
        if(voitures.isEmpty()){
        return " Aucune voiture sauvegardée \n";
        }
        else{
            return "hna resulta final";
        }
    }

    public void addVoiture( Vehicule voit){
        voitures.add(voit);
    }

}
