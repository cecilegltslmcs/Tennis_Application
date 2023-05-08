package com.mycompany.tennis.controller;

import com.mycompany.tennis.core.entity.Joueur;
import com.mycompany.tennis.core.service.JoueurService;

import java.util.Scanner;

public class JoueurController {

    private JoueurService joueurService;

    public JoueurController(){
        this.joueurService = new JoueurService();
    }
    public void afficheDetailsJoueur(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'identifiant du joueur dont vous voulez afficher les informations ?");
        long identifiant = scanner.nextLong();
        Joueur joueur = joueurService.getJoueur(identifiant);
        System.out.println("Le joueur sélectionné s'appelle " + joueur.getPrenom() + " " + joueur.getNom());
        
    }

    public void creerJoueur(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est le nom du joueur que vous voulez ajouter ?");
        String nom = scanner.nextLine();
        System.out.println("Quel est le prénom du joueur que vous voulez ajouter ?");
        String prenom = scanner.nextLine();
        System.out.println("Quel est le sexe du joueur que vous voulez ajouter ? (H ou F)");
        Character sexe = scanner.nextLine().charAt(0);
        Joueur joueur = new Joueur();
        joueur.setNom(nom);
        joueur.setPrenom(prenom);
        joueur.setSexe(sexe);
        joueurService.createJoueur(joueur);
    }
}
