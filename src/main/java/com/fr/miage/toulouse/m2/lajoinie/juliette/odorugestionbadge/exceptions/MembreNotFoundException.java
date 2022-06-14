package com.fr.miage.toulouse.m2.lajoinie.juliette.odorugestionbadge.exceptions;

/**
 * Exception lorsqu'un membre n'est pas trouvé dans le système
 */
public class MembreNotFoundException extends Exception{
    public MembreNotFoundException() {
    }
    public MembreNotFoundException(String msg) {
        super(msg);
    }
}
