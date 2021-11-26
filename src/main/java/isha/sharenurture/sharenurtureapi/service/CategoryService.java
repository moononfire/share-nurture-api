package isha.sharenurture.sharenurtureapi.service;

import isha.sharenurture.sharenurtureapi.model.Category;
import isha.sharenurture.sharenurtureapi.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private CategoryRepository repository;

    @Autowired
    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public List<Category> getAllCategories() {
        return repository.findAll();
    }

//    public List<FacebookGroup> getGroupsOfPrimaryVolunteer(int id) {
//        return repository.findAllByPrimaryVolunteerId(id);
//    }

}