package com.titarenko.fifa_players.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class League {
    @Id
    @Column(name="PK_League_id")
    private Integer leagueId;

    private String leagueName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "FK_LeagueCountry_id")
    private Country country;
}