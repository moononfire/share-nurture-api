package isha.sharenurture.sharenurtureapi.controller;

import isha.sharenurture.sharenurtureapi.model.FacebookGroup;
import isha.sharenurture.sharenurtureapi.model.Volunteer;
import isha.sharenurture.sharenurtureapi.service.GroupService;
import isha.sharenurture.sharenurtureapi.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VolunteerController {

    private VolunteerService volunteerService;
    private GroupService groupService;

    @Autowired
    public VolunteerController(VolunteerService volunteerService, GroupService groupService) {
        this.volunteerService = volunteerService;
        this.groupService = groupService;
    }

    @GetMapping(value = "/volunteers", produces = "application/json")
    public ResponseEntity<List<Volunteer>> getAllVolunteers() {
        return ResponseEntity.ok(volunteerService.getAllVolunteers());
    }

    @GetMapping(value = "/volunteers/{id}", produces = "application/json")
    public ResponseEntity<Volunteer> getVolunteer(@PathVariable int id) {
        return ResponseEntity.ok(volunteerService.getVolunteer(id));
    }

    @GetMapping(value = "/volunteers/{id}/groups", produces = "application/json")
    public ResponseEntity<List<FacebookGroup>> getVolunteerGroups(@PathVariable int id) {
        return ResponseEntity.ok(groupService.getGroupsOfPrimaryVolunteer(id));
    }
}
