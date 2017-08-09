package com.titarenko.fifa_players.model;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public enum Position {
    ST("Striker"),
    RF("Right Forward"),
    CF("Centre Forward"),
    LF("Left Forward"),
    RW("Right Winger"),
    LW("Left Winger"),
    RM("Right Midfielder"),
    CAM("Centre Attacking Midfielder"),
    CDM("Centre Defensive Midfielder"),
    CM("Centre Midfielder"),
    LM("Left Midfielder"),
    RWB("Right Wing Back"),
    RB("Right Back"),
    CB("Centre Back"),
    LWB("Left Wing Back"),
    LB("Left Back"),
    GK("Goalkeeper");

    private final String name;

    Position(String name) {
        this.name = name;
    }

    public Map<String, Position> getAllPositions() {
        Map<String, Position> positions = new HashMap<>();
        for (Position position : Position.values()) {
            positions.put(position.getName(), position);
        }
        return positions;
    }
}