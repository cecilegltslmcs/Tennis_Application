package com.mycompany.tennis.controller;

import com.mycompany.tennis.core.entity.Tournoi;
import com.mycompany.tennis.core.service.TournoiService;

import java.util.Scanner;

public class TournoiController {

    private TournoiService tournoiService;

    public TournoiController(){
        this.tournoiService = new TournoiService();
    }
    public void afficheDetailsTournoi(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est l'identifiant du tournoi dont vous voulez afficher les informations ?");
        long identifiant = scanner.nextLong();
        Tournoi tournoi = tournoiService.getTournoi(identifiant);
        System.out.println("Le tournoi sélectionné est " + tournoi.getNom());

    }

    public void creerTournoi(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est le nom du tournoi que vous voulez ajouter ?");
        String nom = scanner.nextLine();
        System.out.println("Quel est le code du tournoi que vous voulez ajouter ?");
        String code = scanner.nextLine();
        Tournoi tournoi = new Tournoi();
        tournoi.setNom(nom);
        tournoi.setCode(code);
        tournoiService.createTournoi(tournoi);
    }
}
