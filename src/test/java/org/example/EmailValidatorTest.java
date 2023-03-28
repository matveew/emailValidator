package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EmailValidatorTest {
    @ParameterizedTest
    @ValueSource(strings = {"mysite.ourearth.com",
            "mysite@.com.my",
            "@you.me.net",
            "mysite123@gmail.b",
            "mysite@.org.org",
            ".mysite@mysite.org",
            "mysite()*@gmail.com",
            "1mysite.1234@yahoo .com",
            "username#gmail.com",
            "username.gmail.com",
            ".username@gmail.com",
            "user_name@gmail.com",
            "user-name@gmail.com",
            "user&name@gmail.com",
            "user name@gmail.com",
            "username.gmail.com",
            "username@gmail-com",
            "username@gmail com",
            "username@gmail,com"})
    public void checkEmail(String email) {
        System.out.println(email);
        Assertions.assertFalse(EmailValidator.checkEmail(email));
    }
}