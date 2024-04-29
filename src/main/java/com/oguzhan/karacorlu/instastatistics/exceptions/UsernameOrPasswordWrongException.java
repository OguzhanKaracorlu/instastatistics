package com.oguzhan.karacorlu.instastatistics.exceptions;

/**
 * @author oguzhan.karacorlu
 * @project instastatistics
 * @created 29.04.2024
 */
public class UsernameOrPasswordWrongException extends RuntimeException {

    public UsernameOrPasswordWrongException(String exceptionMessage) {
        super(exceptionMessage);
    }
}
