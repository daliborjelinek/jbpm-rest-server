package com.jbmp.restserver.data;

import java.util.List;

public class PhotographersForCategory {

    private List<String> photographers;

    public PhotographersForCategory() {
    }

    public PhotographersForCategory(List<String> photographers) {
        this.photographers = photographers;
    }

    public List<String> getPhotographers() {
        return photographers;
    }

    public void setPhotographers(List<String> photographers) {
        this.photographers = photographers;
    }
}
