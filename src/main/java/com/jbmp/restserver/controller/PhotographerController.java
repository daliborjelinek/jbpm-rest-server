package com.jbmp.restserver.controller;

import com.jbmp.restserver.data.Photographer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("photographers")
public class PhotographerController {


    @PostMapping
    public String photographer(@RequestBody Photographer photographer) {
        return photographer.toString();
    }



    @PutMapping("{id}/approve")
    public String Approve(@RequestBody boolean approved, @PathVariable Long id) {
        if (approved) return "Registration was approved!";
        else return "Registration was declined!";
    }

}
