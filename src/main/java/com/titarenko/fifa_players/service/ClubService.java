package com.titarenko.fifa_players.service;

import com.titarenko.fifa_players.model.Club;
import com.titarenko.fifa_players.repository.ClubRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.Comparator;
import java.util.List;

@org.springframework.stereotype.Service
@ManagedBean
@SessionScoped
@Getter
public class ClubService {

    @Autowired
    private ClubRepository clubRepository;

    private Iterable<Club> clubList;

    @PostConstruct
    private void init() {
        clubList = clubRepository.findAll();
//        sortedList(clubList);
    }

    public void sortedList(List<Club> clubList) {
        if (clubList != null && clubList.size() > 1)
            clubList.sort(new Comparator<Club>() {
                @Override
                public int compare(Club club1, Club club2) {
                    if (club1 != null && club2 != null) {
                        return club1.getClubName().compareTo(club2.getClubName());
                    } else if (club1 != null) {
                        return -1;
                    } else if (club2 != null) {
                        return 1;
                    } else return 0;
                }
            });
    }
}