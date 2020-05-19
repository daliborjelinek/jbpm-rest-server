package com.jbmp.restserver.data;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class SelectedPhotographerSingletonBean {

    private String photographerName;

    public SelectedPhotographerSingletonBean() {
    }

    public String getPhotographerName() {
        return photographerName;
    }

    public void setPhotographerName(String photographerName) {
        this.photographerName = photographerName;
    }
}
