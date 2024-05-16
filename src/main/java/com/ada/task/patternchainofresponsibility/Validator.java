package com.ada.task.patternchainofresponsibility;


interface Validator {
    boolean validate(User user);
    void validateNext(Validator validator);
    Validator getNextValidator();
}
