package isha.sharenurture.sharenurtureapi.controller;

import isha.sharenurture.sharenurtureapi.model.Category;
import isha.sharenurture.sharenurtureapi.model.Content;
import isha.sharenurture.sharenurtureapi.service.CategoryService;
import isha.sharenurture.sharenurtureapi.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    private CategoryService service;

    @Autowired
    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @GetMapping(value = "/categories", produces = "application/json")
    public ResponseEntity<List<Category>> getAllCategories() {
        return ResponseEntity.ok(service.getAllCategories());
    }
}