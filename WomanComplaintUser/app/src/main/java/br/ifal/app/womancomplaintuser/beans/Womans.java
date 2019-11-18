package br.ifal.app.womancomplaintuser.beans;

import java.io.Serializable;

public class Womans extends Serializable{

    private int id;
    private String name;
    private String email;

    public Womans(int id, String name, String email) {
        id = id;
        name = name;
        email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        email = email;
    }

    @Override
    public String toString() {
        return "Womans{" +
                "Id=" + id +
                ", Name='" + name + '\'' +
                ", Email='" + email + '\'' +
                '}';
    }
}
