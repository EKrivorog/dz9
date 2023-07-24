package org.example;

public class Woman extends Person {


    @Override
    protected String revertLastName() {
        return getLastName();
    }
}
