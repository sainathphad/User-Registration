package com.bridgelabz;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static final String NAME_PATTERN = "^[A-Z][a-z]{3,}$";
    public static final String EMAIL_PATTERN = "^[0-9A-Za-z]+([-_+.][0-9A-Za-z]+)?[@][a-zA-Z0-9]+" +
                                                                "[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
    public static final String MOBILE_NUM_PATTERN = "^[+][0-9]{2}[1-9][0-9]{9}$";
    public static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@$%?&]).{8,}$";


    //PATTERN CHECK
    public boolean checkFirstName(String firstName){
        return patternChecker(firstName, NAME_PATTERN);
    }

    public boolean checkLastName(String lastName){
        return patternChecker(lastName, NAME_PATTERN);
    }

    public static boolean checkEmail(String email){
        return patternChecker(email, EMAIL_PATTERN);
    }

    public static boolean checkMobileNum(String mobileNum) {
        return patternChecker(mobileNum, MOBILE_NUM_PATTERN);
    }

    public static boolean checkPassword(String password) {
        return patternChecker(password, PASSWORD_PATTERN);
    }

    //PATTERN CHECK METHOD
    private static boolean patternChecker(String input, String inputPattern) {
        Pattern pattern = Pattern.compile(inputPattern);
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }
}
