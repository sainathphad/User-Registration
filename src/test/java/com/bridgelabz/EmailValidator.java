package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailValidator {
    public String email;
    public boolean status;

    public EmailValidator(String email, boolean status) {
        this.email = email;
        this.status = status;
    }
    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{{"abc@yahoo.com", true}, {"abc-100@yahoo.com", true},
                                            {"abc.100@yahoo.com",true}, {"abc-100@abc.net", true},
                                            {"abc.100@abc.com.au", true}, {"abc@1.com", true},
                                            {"abc@.com.my", false}, {"abc123@gmail.a", false}});
    }

    @Test
    public void emailChecker() {
        boolean result = UserRegistration.checkEmail(email);
        Assert.assertEquals(this.status, result);
    }
}
