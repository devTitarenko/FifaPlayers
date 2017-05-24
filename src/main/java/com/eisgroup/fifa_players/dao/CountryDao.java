package com.eisgroup.fifa_players.dao;

import com.eisgroup.fifa_players.model.Country;
import org.springframework.stereotype.Repository;

@Repository
public class CountryDao extends BaseDaoImpl<Country> {

    public CountryDao() {
        setType(Country.class);
    }
}