package isha.sharenurture.sharenurtureapi.controller;

import isha.sharenurture.sharenurtureapi.model.Content;
import isha.sharenurture.sharenurtureapi.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContentController {

    private ContentService service;

    @Autowired
    public ContentController(ContentService service) {
        this.service = service;
    }

    @GetMapping(value = "/contents", produces = "application/json")
    public ResponseEntity<List<Content>> getAllContents() {
        return ResponseEntity.ok(service.getAllContents());
    }
}
