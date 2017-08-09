package com.titarenko.fifa_players.repository;

import com.titarenko.fifa_players.model.Club;
import org.springframework.data.repository.CrudRepository;

public interface ClubRepository extends CrudRepository<Club, Integer> {
}