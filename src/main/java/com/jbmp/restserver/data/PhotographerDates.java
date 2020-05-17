package com.jbmp.restserver.data;

import java.util.List;

public class PhotographerDates {

    private List<String> dates;

    public PhotographerDates() {
    }

    public PhotographerDates(List<String> dates) {
        this.dates = dates;
    }

    public void setDates(List<String> dates) {
        this.dates = dates;
    }

    public List<String> getDates() {
        return dates;
    }
}
