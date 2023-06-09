package com.mycompany.tennis.core.service;

import com.mycompany.tennis.core.DAO.MatchDaoImpl;
import com.mycompany.tennis.core.entity.Match;
import com.mycompany.tennis.core.repository.MatchRepositoryImpl;
import com.mycompany.tennis.core.repository.ScoreRepositoryImpl;

public class MatchService {

    private ScoreRepositoryImpl scoreRepository;
    private MatchRepositoryImpl matchRepository;

    //private MatchDaoImpl matchDao;

    public MatchService(){
        this.scoreRepository = new ScoreRepositoryImpl();
        this.matchRepository = new MatchRepositoryImpl();
        //matchDao = new MatchDaoImpl();
    }
    public void saveNewMatch(Match match){
        //matchDao.createMatchwithScore(match);
        matchRepository.create(match);
        scoreRepository.create(match.getScore());
    }
}
