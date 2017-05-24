package com.eisgroup.fifa_players.dao;

import com.eisgroup.fifa_players.model.Player;
import org.springframework.stereotype.Repository;

@Repository
public class PlayerDao extends BaseDaoImpl<Player> {

    public PlayerDao() {
        setType(Player.class);
    }
}