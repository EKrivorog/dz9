package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Person partner;

    public Person() {
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = null;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }

    public boolean isRetired() {
        if (this instanceof Woman) {
            return age >= 60;
        } else {
            return age >= 65;
        }
    }

    public void registerPartnership(Person partner) {
        this.partner = partner;
        if (this instanceof Woman) {
            this.lastName = partner.getLastName();
        }
    }

    public void deregisterPartnership(boolean revertLastName) {
        if (this.partner != null) {
            this.partner = null;
            if (revertLastName && this instanceof Woman) {
                this.lastName = revertLastName();
            }
        }
    }

    protected String revertLastName() {
        return lastName;
    }
}
