package com.company;

public class Moteur {

    protected String Cylindre;
    protected Double prix;
    protected TypeMoteur type;

    public Moteur(String cylindre, Double prix, TypeMoteur type) {
       this.Cylindre = cylindre;
        this.prix = prix;
        this.type = type;
    }
    public Moteur(){

    }
    public Moteur(String cylindre, Double prix){
        this.Cylindre = cylindre;
        this.prix = prix;
    }

    public void setMoteur(Moteur moteurE){
        this.prix = moteurE.prix;
        this.Cylindre = moteurE.Cylindre;
    }
    @Override
    public String toString() {
        return prix + " " + Cylindre;
    }

    public Double getPrix() {
        return prix;
    }
}
