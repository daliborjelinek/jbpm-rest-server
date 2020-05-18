package com.jbmp.restserver.data;

import java.util.List;

public class PhotographerOrderDates {

    private List<String> dates;

    public PhotographerOrderDates() {
    }

    public PhotographerOrderDates(List<String> dates) {
        this.dates = dates;
    }

    public void setDates(List<String> dates) {
        this.dates = dates;
    }

    public List<String> getDates() {
        return dates;
    }
}
