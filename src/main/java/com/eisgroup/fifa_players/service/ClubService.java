package com.eisgroup.fifa_players.service;

import com.eisgroup.fifa_players.dao.ClubDao;
import com.eisgroup.fifa_players.model.Club;
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
    private ClubDao clubDao;

    private List<Club> clubList;

    @PostConstruct
    private void init() {
        clubList = clubDao.list();
        sortedList(clubList);
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