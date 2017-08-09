package com.titarenko.fifa_players.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Player {

    @Id
    @Column(name = "PK_Player_id")
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Integer playerId;

    private String firstName;

    private String lastName;

    private Date birthDate;

    private Integer costs;

    private Integer stats;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "FK_PlayerClub_id")
    private Club club;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "FK_PlayerCountry_id")
    private Country country;

    @Enumerated(EnumType.STRING)
    private Position position;

    @Enumerated(EnumType.STRING)
    private Skill skill;

    private static final Format dateFormat = new SimpleDateFormat("dd MMM yyyy", Locale.UK);

    public String getFormattedBirthDate(){
        return dateFormat.format(birthDate);
    }
}