package com.eisgroup.fifa_players.model;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public enum Skill {
    ONE("1 star"),
    TWO("2 stars"),
    THREE("3 stars"),
    FOUR("4 stars"),
    FIVE("5 stars");

    private final String name;

    Skill(String name) {
        this.name = name;
    }

    public Map<String, Skill> getAllSkills() {
        Map<String, Skill> skills = new HashMap<>();
        for (Skill skill : Skill.values()) {
            skills.put(skill.getName(), skill);
        }
        return skills;
    }
}