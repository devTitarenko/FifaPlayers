package com.titarenko.fifa_players.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FacesValidator("statsValidator")
public class StatsValidator implements Validator {

    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {

        String inputString = String.valueOf(value);
        if (inputString == null)
            return;
        Pattern pattern = Pattern.compile("^[0-9]{4}$");
        Matcher matcher = pattern.matcher(inputString);
        if (!matcher.matches()) {
            ResourceBundle resourceBundle = PropertyResourceBundle.getBundle("messages/messages_en");

            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "",
                    resourceBundle.getString("Error.notValidStats")));

        }
    }
}
