package com.titarenko.fifa_players.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Country {
    @Id
    @Column(name = "PK_Country_id")
    private String countryId;

    private String countryName;
}