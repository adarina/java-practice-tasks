package com.ada.task.patternchainofresponsibility;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

class NameUserValidator extends UserValidator {

    private static final Pattern NAME_PATTERN = Pattern.compile("[A-Za-z]+");

    @Override
    public boolean check(User user) {
        if (StringUtils.isBlank(user.getName()) || !NAME_PATTERN.matcher(user.getName()).matches()) {
            return false;
        }
        return checkNext(user);
    }
}
