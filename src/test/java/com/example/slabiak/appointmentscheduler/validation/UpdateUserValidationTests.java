package com.example.slabiak.appointmentscheduler.validation;

import com.example.slabiak.appointmentscheduler.model.UserForm;
import com.example.slabiak.appointmentscheduler.validation.groups.UpdateCorporateCustomer;
import com.example.slabiak.appointmentscheduler.validation.groups.UpdateProvider;
import com.example.slabiak.appointmentscheduler.validation.groups.UpdateUser;
import org.junit.Before;
import org.junit.Test;


import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class UpdateUserValidationTests {

    private ValidatorFactory factory;
    private Validator validator;

    @Before
    public void stup(){
        factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void shouldHave8ViolationsForEmptyFormWhenUpdateUser(){
        UserForm form = new UserForm();
        Set<ConstraintViolation<UserForm>> violations = validator.validate(form,UpdateUser.class);
        assertEquals(violations.size(),8);
    }

}
