package com.eisgroup.fifa_players.service;

import com.eisgroup.fifa_players.dao.CountryDao;
import com.eisgroup.fifa_players.model.Country;
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
public class CountryService {

    @Autowired
    private CountryDao countryDao;

    private List<Country> countryList;

    @PostConstruct
    private void init() {
        countryList = countryDao.list();
        sortedList(countryList);
    }

    public void sortedList(List<Country> countryList) {
        if (countryList != null && countryList.size() > 1)
            countryList.sort(new Comparator<Country>() {
                @Override
                public int compare(Country country1, Country country2) {
                    if (country1 != null && country2 != null) {
                        return country1.getCountryName().compareTo(country2.getCountryName());
                    } else if (country1 != null) {
                        return -1;
                    } else if (country2 != null) {
                        return 1;
                    } else return 0;
                }
            });
    }
}