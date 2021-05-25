package com.bridgelabz;


public class UserRegistration {

    String namePattern = "^[A-Z][a-z]{3,}$";

    //PATTERN CHECK
    public boolean checkPattern(String firstName){
        boolean result = firstName.matches(namePattern);
        return result;
    }

}
