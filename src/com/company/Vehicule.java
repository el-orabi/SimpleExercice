package com.company;
import java.util.List;

public class Vehicule {

    /*les attribus*/

    private Double prix;
    private String nom;
    private List<Option> options;
    private Marque nomMarque;

    public Vehicule( Double prix, String nom, List<Option> options, Marque nomMarque){
        this.options = options;
        this.nomMarque = nomMarque;
        this.nom = nom;
        this.prix = prix;
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

    public void addOption( Option opt){
        options.add(opt);
    }

    public String toString() {
        return "";

    }
}
