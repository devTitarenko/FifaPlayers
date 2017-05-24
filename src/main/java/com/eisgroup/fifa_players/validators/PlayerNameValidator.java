package com.eisgroup.fifa_players.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

@FacesValidator("playerNameValidator")
public class PlayerNameValidator implements Validator{

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        ResourceBundle resourceBundle = PropertyResourceBundle.getBundle("messages_en");

        String inputString = (String) value;

        if (inputString == null) {
            return;
        }

        if ("".equals(inputString.trim())) {
            throw new ValidatorException(new FacesMessage(
                    FacesMessage.SEVERITY_ERROR, "", resourceBundle.getString("Error.MandatoryFields")));
        }

        if (inputString.length() > 20) {
            throw new ValidatorException(new FacesMessage(
                    FacesMessage.SEVERITY_ERROR, "", resourceBundle.getString("Error.invalidNameLength")));
        }

        new LatinNumberSpecialValidator().validate(context, component, value);
    }
}
