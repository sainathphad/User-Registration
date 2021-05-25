package com.bridgelabz;


public class UserRegistration {

    public String namePattern = "^[A-Z][a-z]{3,}$";

    //PATTERN CHECK
    public boolean checkFirstName(String firstName){
        boolean result = firstName.matches(namePattern);
        return result;
    }
    public boolean checkLastName(String lastName){
        boolean result = lastName.matches(namePattern);
        return result;
    }
}
