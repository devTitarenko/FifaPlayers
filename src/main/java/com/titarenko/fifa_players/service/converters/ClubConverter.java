package com.titarenko.fifa_players.service.converters;

import com.titarenko.fifa_players.model.Club;
import com.titarenko.fifa_players.repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Component
@FacesConverter("clubConverter")
public class ClubConverter implements Converter {

    @Autowired
    private ClubRepository clubRepository;

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        return clubRepository.findOne(Integer.decode(value));
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object object) {
        if (object != null && object.getClass().equals(Club.class)) {
            return String.valueOf(((Club) object).getClubId());
        } else {
            return null;
        }
    }
}