package com.springmvc.validator;

import com.springmvc.entity.User;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @author zjl
 */
public class UserValidator implements Validator {
    public boolean supports(Class <?> clazz) {
        if ( User.class.isAssignableFrom(clazz) ) {
            return true;
        }
        return false;
    }

    public void validate(Object target, Errors errors) {

    }
}
