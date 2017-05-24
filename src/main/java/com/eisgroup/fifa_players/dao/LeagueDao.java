package com.eisgroup.fifa_players.dao;

import com.eisgroup.fifa_players.model.League;
import org.springframework.stereotype.Repository;

@Repository
public class LeagueDao<T extends League> extends BaseDaoImpl<T> {

    public LeagueDao() {
        setType((Class<T>) League.class);
    }

}
