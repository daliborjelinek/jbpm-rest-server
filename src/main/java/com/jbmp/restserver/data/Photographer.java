package com.jbmp.restserver.data;

public class Photographer {

    private String name;
    private String email;
    private String web;
    private String ico;

    public Photographer() {
    }

    @Override
    public String toString() {
        return "Photographer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", web='" + web + '\'' +
                ", ico='" + ico + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getIco() {
        return ico;
    }

    public void setIco(String ico) {
        this.ico = ico;
    }
}

