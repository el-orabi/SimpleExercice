package com.company;

import java.util.List;

public class Lagouna extends Vehicule {



    public Lagouna(String cylindre, Double prix, TypeMoteur type, Double prix1, String nom, List<Option> options, Marque nomMarque) {
        super(cylindre, prix, type, prix1, nom, options, nomMarque);
    }

    public Lagouna(){
        System.out.println("creation de lag1");
    }
}
