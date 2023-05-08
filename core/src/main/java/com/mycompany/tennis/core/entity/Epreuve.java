package com.mycompany.tennis.core.entity;

public class Epreuve {
    private Long id;
    private Short annee;
    private Tournoi tounoi;
    private Character typeEpreuve;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getAnnee() {
        return annee;
    }

    public void setAnnee(Short annee) {
        this.annee = annee;
    }

    public Tournoi getTounoi() {
        return tounoi;
    }

    public void setTounoi(Tournoi tounoi) {
        this.tounoi = tounoi;
    }

    public Character getTypeEpreuve() {
        return typeEpreuve;
    }

    public void setTypeEpreuve(Character typeEpreuve) {
        this.typeEpreuve = typeEpreuve;
    }
}
