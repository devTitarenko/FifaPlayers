package com.eisgroup.fifa_players.model;

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
public class Club {
    @Id
    @Column(name = "PK_Club_id")
    private Integer clubId;

    private String clubName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "FK_ClubLeague_id")
    private League league;
}