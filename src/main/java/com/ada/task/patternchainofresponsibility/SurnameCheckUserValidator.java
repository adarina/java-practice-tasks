package com.ada.task.patternchainofresponsibility;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

class SurnameCheckUserValidator extends UserValidator {
    private static final Pattern SURNAME_PATTERN = Pattern.compile("[A-Za-z]+");

    @Override
    public boolean check(User user) {
        if (StringUtils.isBlank(user.getSurname()) || !SURNAME_PATTERN.matcher(user.getSurname()).matches()) {
            return false;
        }
        return checkNext(user);
    }

}