package com.bridgelabz;


import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_whenProper_returnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.checkFirstName("Bridge");
        Assert.assertTrue(status);
    }

    @Test
    public void givenLastName_whenProper_returnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.checkLastName("Labz");
        Assert.assertTrue(status);
    }

    @Test
    public void givenMobileNumber_whenValid_returnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.checkMobileNum("+918602094265");
        Assert.assertTrue(status);
    }

    @Test
    public void givenPassword_whenMin8Character_returnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.checkPassword("abCd@123");
        Assert.assertTrue(status);
    }

    @Test
    public void givenPassword_whenHave_Min1UpperCase_returnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.checkPassword("abCd@123");
        Assert.assertTrue(status);
    }
}