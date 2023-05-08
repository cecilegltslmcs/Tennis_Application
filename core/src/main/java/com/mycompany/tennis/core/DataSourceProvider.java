package com.mycompany.tennis.core;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;

public class DataSourceProvider {

    private static BasicDataSource singleDataSource;

    public static DataSource getSingleDataSourceInstance(){
        if (singleDataSource == null){
            singleDataSource = new BasicDataSource();
            singleDataSource.setInitialSize(5);
            singleDataSource.setUrl("jdbc:postgresql://localhost:5432/TENNIS");
            singleDataSource.setUsername("user_app");
            singleDataSource.setPassword("password");
        }
        return singleDataSource;
    }
}
