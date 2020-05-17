package com.jbmp.restserver.data;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class PhotographerSingletonBean {

    private String photographerName;

    public PhotographerSingletonBean() {
    }

    public String getPhotographerName() {
        return photographerName;
    }

    public void setPhotographerName(String photographerName) {
        this.photographerName = photographerName;
    }
}
