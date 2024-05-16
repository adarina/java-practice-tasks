package com.ada.task.patternchainofresponsibility;

class PasswordValidator implements Validator {

    private Validator nextValidator;

    @Override
    public void validateNext(Validator nextValidator) {
        this.nextValidator = nextValidator;
    }

    @Override
    public Validator getNextValidator() {
        return nextValidator;
    }
    @Override
    public boolean validate(User user) {
        return user.getPassword().length() >= 8;
    }
}
