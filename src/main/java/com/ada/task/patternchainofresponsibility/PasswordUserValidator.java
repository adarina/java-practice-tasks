package com.ada.task.patternchainofresponsibility;

import org.apache.commons.lang3.StringUtils;

public class PasswordUserValidator extends UserValidator {

    @Override
    public boolean check(User user) {
        if (StringUtils.isBlank(user.getPassword()) || user.getPassword().length() < 8) {
            return false;
        }
        return checkNext(user);
    }
}
