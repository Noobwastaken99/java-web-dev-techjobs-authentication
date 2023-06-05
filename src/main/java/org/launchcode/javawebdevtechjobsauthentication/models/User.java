package org.launchcode.javawebdevtechjobsauthentication.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import static sun.nio.fs.UnixPath.encoder;

@Entity
public class User extends  AbstractEntity {

    @NotNull
    private String username;

    @NotNull
    private String pwHash;

    public User() {}

    public User(String username, String password) {
        this.username = username;
        this.pwHash = encoder.encode(password);
    }

    public String getUsername() {
        return username;
    }

}
