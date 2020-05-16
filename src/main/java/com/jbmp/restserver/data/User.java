package com.jbmp.restserver.data;

public class User {

    private final String city;
    private final String email;
    private final String name;
    private final String surname;
    private final String password;
    private final String phone;
    private final String sex;
    private final String street;

    @Override
    public String toString ()
    {
        return "User{" + "city='" + city + '\'' + ", email='" + email + '\'' + ", name='" + name + '\'' + ", surname='" + surname + '\'' + ", password='" + password + '\'' + ", phone='" + phone + '\'' + ", sex='" + sex + '\'' + ", street='" + street + '\'' + '}';
    }

    public String getCity ()
    {
        return city;
    }

    public String getEmail ()
    {
        return email;
    }

    public String getName ()
    {
        return name;
    }

    public String getSurname ()
    {
        return surname;
    }

    public String getPassword ()
    {
        return password;
    }

    public String getPhone ()
    {
        return phone;
    }

    public String getSex ()
    {
        return sex;
    }

    public String getStreet ()
    {
        return street;
    }

    public User (String city, String email, String name, String surname, String password, String phone, String sex, String street)
    {
        this.city = city;
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.phone = phone;
        this.sex = sex;
        this.street = street;
    }
}
