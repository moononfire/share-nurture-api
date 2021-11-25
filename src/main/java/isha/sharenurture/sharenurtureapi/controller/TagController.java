package isha.sharenurture.sharenurtureapi.controller;

import isha.sharenurture.sharenurtureapi.model.Tag;
import isha.sharenurture.sharenurtureapi.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TagController {

    private TagService service;

    @Autowired
    public TagController(TagService service) {
        this.service = service;
    }

    @GetMapping(value = "/tags", produces = "application/json")
    public ResponseEntity<List<Tag>> getAllTags() {
        return ResponseEntity.ok(service.getAllTags());
    }
}