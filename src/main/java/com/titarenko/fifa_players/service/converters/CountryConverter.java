package com.titarenko.fifa_players.service.converters;

import com.titarenko.fifa_players.model.Country;
import com.titarenko.fifa_players.repository.CountryRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Component
@FacesConverter("countryConverter")
@Getter
public class CountryConverter implements Converter {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        return countryRepository.findOne(value);
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object object) {
        if (object != null && object.getClass().equals(Country.class)) {
            return ((Country) object).getCountryId();
        } else {
            return null;
        }
    }
}