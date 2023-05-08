package com.mycompany.tennis.core.repository;

import com.mycompany.tennis.core.DataSourceProvider;
import com.mycompany.tennis.core.entity.Joueur;
import com.mycompany.tennis.core.entity.Match;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MatchRepositoryImpl {
    public void create(Match match) {
        Connection conn = null;
        try {
            DataSource dataSource = DataSourceProvider.getSingleDataSourceInstance();

            conn = dataSource.getConnection();
            ResultSet rs;
            try (PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO MATCH_TENNIS (ID_EPREUVE, ID_VAINQUEUR, ID_FINALISTE) VALUES (?, ?, ?)", Statement.RETURN_GENERATED_KEYS)) {

                preparedStatement.setLong(1, match.getEpreuve().getId());
                preparedStatement.setLong(2, match.getVainqueur().getId());
                preparedStatement.setLong(3, match.getFinaliste().getId());

                preparedStatement.executeUpdate();

                rs = preparedStatement.getGeneratedKeys();
            }

            if(rs.next()){
                match.setId(rs.getLong(1));
            }

            System.out.println("New Match Created!");
        } catch (SQLException e) {
            e.printStackTrace();
            try {
                if (conn != null) conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
                }
            }
        finally {
                try {
                    if (conn != null) {
                        conn.close();
                    }

                    } catch(SQLException e){
                        e.printStackTrace();
                    }
                }
            }
}