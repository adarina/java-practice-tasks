package com.ada.task.patternchainofresponsibility;

class UserValidatorChain {
    private Validator validator;

    public UserValidatorChain() {
        buildChain();
    }

    private void buildChain() {
        Validator passwordValidator = new PasswordValidator();
        Validator emailValidator = new EmailValidator();
        Validator phoneValidator = new PhoneValidator();
        Validator surnameValidator = new SurnameValidator();
        Validator nameValidator = new NameValidator();

        nameValidator.validateNext(surnameValidator);
        surnameValidator.validateNext(phoneValidator);
        phoneValidator.validateNext(emailValidator);
        emailValidator.validateNext(passwordValidator);

        validator = nameValidator;
    }

    public boolean validate(User user) {
        Validator currentValidator = validator;
        while (currentValidator != null) {
            if (!currentValidator.validate(user)) {
                return false;
            }
            currentValidator = currentValidator.getNextValidator();
        }
        return true;
    }
}
