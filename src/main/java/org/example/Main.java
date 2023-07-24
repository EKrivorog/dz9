package org.example;


public class Main {
    public static void main(String[] args) {
        Man evgeniy = new Man();
        evgeniy.setFirstName("Evgeniy");
        evgeniy.setLastName("Krivorog");
        evgeniy.setAge(32);

        Woman natalia = new Woman();
        natalia.setFirstName("Natalia");
        natalia.setLastName("Krivorog");
        natalia.setAge(32);

        evgeniy.registerPartnership(natalia);
        natalia.registerPartnership(evgeniy);

        System.out.println(evgeniy.getFirstName() + " and " + natalia.getFirstName() + " are partners.");
        System.out.println(evgeniy.getFirstName() + "'s last name is now: " + evgeniy.getLastName());
        System.out.println(natalia.getFirstName() + "'s last name is now: " + natalia.getLastName());

        System.out.println(evgeniy.getFirstName() + " is retired: " + evgeniy.isRetired());
        System.out.println(natalia.getFirstName() + " is retired: " + natalia.isRetired());

        evgeniy.setAge(33);
        natalia.setAge(33);

        System.out.println(evgeniy.getFirstName() + " is retired: " + evgeniy.isRetired());
        System.out.println(natalia.getFirstName() + " is retired: " + natalia.isRetired());

        evgeniy.deregisterPartnership(true);
        natalia.deregisterPartnership(true);

        System.out.println(evgeniy.getFirstName() + " and " + natalia.getFirstName() + " are no longer partners.");
        System.out.println(evgeniy.getFirstName() + "'s last name is now: " + evgeniy.getLastName());
        System.out.println(natalia.getFirstName() + "'s last name is now: " + natalia.getLastName());
    }
}
