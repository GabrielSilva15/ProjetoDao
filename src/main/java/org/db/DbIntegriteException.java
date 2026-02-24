package org.db;

public class DbIntegriteException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public DbIntegriteException(String msg) {
        super(msg);
    }
}
