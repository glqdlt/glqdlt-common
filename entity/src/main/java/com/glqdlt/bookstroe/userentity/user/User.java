package com.glqdlt.bookstroe.userentity.user;

public interface User {
    String getName();
    void setName(String name);

    Long getId();
    void setId(Long id);

    String getUserId();
    void setUserId(String userId);

    String getUserPassword();
    void setUserPassword(String password);
}
