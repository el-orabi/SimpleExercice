package com.company;

import java.util.List;

public class A300B extends Vehicule {
    public A300B(String cylindre, Double prix, TypeMoteur type, Double prix1, String nom, List<Option> options, Marque nomMarque) {
        super(cylindre, prix, type, prix1, nom, options, nomMarque);
    }

    public A300B() {
        System.out.println("creation de A300");
    }
}
