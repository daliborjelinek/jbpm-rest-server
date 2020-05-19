package com.jbmp.restserver.controller;

import com.jbmp.restserver.data.PhotographerOrderData;
import com.jbmp.restserver.data.PhotographerOrderDates;
import com.jbmp.restserver.data.PhotographersForCategory;
import com.jbmp.restserver.data.SelectedPhotographerSingletonBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/photographerOrder")
public class PhotographerOrderController {

    @Autowired
    private SelectedPhotographerSingletonBean selectedPhotographerSingletonBean;

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/category")
    public void loadPhotographersForCategory() {
        logger.info("Nacitani fotografu pro zvolenou kategorii ");
    }

    @PostMapping("/photographer/dates")
    public void loadPhotographerDates(@RequestBody PhotographersForCategory photographers) {
        String photographerName = photographers.getPhotographers().get(0);
        selectedPhotographerSingletonBean.setPhotographerName(photographerName);
        logger.info("Nacitani dat pro fotografa " + photographerName);
    }

    @PostMapping("/photographer")
    public PhotographerOrderData loadPhotographerData(@RequestBody PhotographerOrderDates photographerOrderDates) {
        String date = photographerOrderDates.getDates().get(0);
        String photographerName = selectedPhotographerSingletonBean.getPhotographerName();

        logger.info("Nacitani dat k fotografovi " + photographerName + " pro datum " + date);
        if (photographerName.equals("Dalibor Jelinek")) {
            return new PhotographerOrderData(date, 5000, "Dalibor Jelinek", 75,
                    "+4806547895", "dalibor@photomeet.com");
        } else {
            return new PhotographerOrderData(date, 4000, "Verca Podobova", 90,
                    "+255265498", "verca@photomeet.com");
        }
    }

    @PostMapping("/processOrder")
    public boolean processOrder(@RequestBody String message) {
        boolean isIncident = Math.floor(Math.random() * 10) >= 9;
        logger.info("Zpracovani objednavky " + message);
        logger.info(isIncident ? "Incident nastal" : "Incident nenastal");
        return isIncident;
    }

    @PostMapping("/processIncident")
    public void processIncident(@RequestBody String message) {
        logger.info("Zpracovani incidentu" + message);
    }

}
