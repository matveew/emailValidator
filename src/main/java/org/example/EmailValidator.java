package org.example;

import java.util.regex.Pattern;

public class EmailValidator {
    final private static String REGEX = "^[a-zA-Z][a-zA-Z0-9.]*[a-zA-Z0-9]@[a-zA-Z0-9]{2,}\\.[a-zA-Z0-9]{2,}";

    public static boolean checkEmail(String email) {
        Pattern pattern = Pattern.compile(REGEX);
        return pattern.matcher(email).matches();
    }

}