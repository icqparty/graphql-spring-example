package ru.icqparty.apifirebody.models;


public enum Role  {

    ROLE_ADMIN, ROLE_CLIENT, ROLE_MANAGER;

    public String getAuthority() {
        return name();
    }

}
