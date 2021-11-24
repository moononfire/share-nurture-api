package isha.sharenurture.sharenurtureapi.controller;

import isha.sharenurture.sharenurtureapi.model.Group;
import isha.sharenurture.sharenurtureapi.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GroupController {

    private GroupService service;

    @Autowired
    public GroupController(GroupService service) {
        this.service = service;
    }

    @GetMapping(value = "/{id}/groups", produces = "application/json")
    public ResponseEntity<List<Group>> getGroupsOfVolunteer(@PathVariable int id) {
        return ResponseEntity.ok(service.getGroupsOfPrimaryVolunteerId(id));
    }
}
