package isha.sharenurture.sharenurtureapi.controller;

import isha.sharenurture.sharenurtureapi.model.Volunteer;
import isha.sharenurture.sharenurtureapi.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VolunteerController {

    private VolunteerService service;

    @Autowired
    public VolunteerController(VolunteerService service) {
        this.service = service;
    }

    @GetMapping(value = "/", produces = "application/json")
    public Volunteer getVolunteer(@PathVariable int id) {
        return service.getVolunteer(id);
    }
}
