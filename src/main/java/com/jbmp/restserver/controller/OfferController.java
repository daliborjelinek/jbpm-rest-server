package com.jbmp.restserver.controller;

import com.jbmp.restserver.data.Offer;
import com.jbmp.restserver.data.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class OfferController
{
  @GetMapping("/checkPrice")
  public boolean checkPrice(@RequestParam Long price) {
    return (price < 15000);
  }

  @PostMapping("/saveOffer")
  public Offer saveOffer(@RequestBody Offer offer) {
    System.out.println("Saving " + offer);
    return offer;
  }
}
