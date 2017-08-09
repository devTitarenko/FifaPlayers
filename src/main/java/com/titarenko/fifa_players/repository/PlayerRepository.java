package com.titarenko.fifa_players.repository;

import com.titarenko.fifa_players.model.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Integer> {
}