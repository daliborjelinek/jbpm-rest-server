package com.jbmp.restserver.data;

public class User {

    private final int id;

    @Override
    public String toString ()
    {
        return "User{" + "id=" + id + ", email='" + email + '\'' + ", jmeno='" + jmeno + '\'' + ", prijmeni='" + prijmeni + '\'' + ", telefon='" + telefon + '\'' + '}';
    }

    public int getId ()
    {
        return id;
    }

    public String getEmail ()
    {
        return email;
    }

    public String getJmeno ()
    {
        return jmeno;
    }

    public String getPrijmeni ()
    {
        return prijmeni;
    }

    public String getTelefon ()
    {
        return telefon;
    }

    public User (int id, String email, String jmeno, String prijmeni, String telefon)
    {
        this.id = id;
        this.email = email;
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.telefon = telefon;
    }

    private final String email;
    private final String jmeno;
    private final String prijmeni;
    private final String telefon;

}
