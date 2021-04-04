package com.pgsb.core.user;

public interface EncryptService {
    String encrypt(String password);
    boolean check(String checkPassword, String realPassword);
}
