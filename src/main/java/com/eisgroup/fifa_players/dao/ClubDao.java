package com.eisgroup.fifa_players.dao;

import com.eisgroup.fifa_players.model.Club;
import org.springframework.stereotype.Repository;

@Repository
public class ClubDao extends BaseDaoImpl<Club> {

    public ClubDao() {
        setType(Club.class);
    }
}