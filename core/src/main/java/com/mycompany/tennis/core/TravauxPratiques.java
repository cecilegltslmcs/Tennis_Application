package com.mycompany.tennis.core;

import com.mycompany.tennis.core.entity.Tournoi;
import com.mycompany.tennis.core.repository.TournoiRepositoryImpl;
import com.mycompany.tennis.core.service.TournoiService;

public class TravauxPratiques {
    public static void main(String... args){
        /*TournoiRepositoryImpl tournoiRepository = new TournoiRepositoryImpl();
        tournoiRepository.list().stream().forEach(tournoi -> System.out.println("Tournoi numéro " + tournoi.getId() +
                " Nom : " + tournoi.getNom() +
                " Code : " + tournoi.getCode()));*/
        TournoiService tournoiService = new TournoiService();
        tournoiService.getTournoi(1L);
    }
}
