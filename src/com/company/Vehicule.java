package com.company;
import java.util.ArrayList;
import java.util.List;

public class Vehicule extends Moteur {


    protected Double prix;
    protected String nom;
    protected List<Option> options = new ArrayList<>();
    protected Marque nomMarque;

    public Vehicule(String cylindre, Double prix, TypeMoteur type, Double prix1, String nom, List<Option> options, Marque nomMarque) {
        super(cylindre, prix, type);
        this.prix = prix1;
        this.nom = nom;
        this.options = options;
        this.nomMarque = nomMarque;
    }
    public Vehicule(){

    }

    public Double getPrix() {
        return prix;
    }

    public List<Option> getOptions() {
        return options;
    }

    public Marque getMarque() {
        return nomMarque;
    }

    public void addOption( Option options){
        this.options.add(options);
    }

    public String toString() {
        return "";

    }
}
