package com.company;

import java.util.List;

public class VitreElectrique extends Vehicule {

    public VitreElectrique(Double prix, String nom, List<Option> options, Marque nomMarque) {
        super(prix, nom, options, nomMarque);
    }

    public VitreElectrique(){

    }
}
