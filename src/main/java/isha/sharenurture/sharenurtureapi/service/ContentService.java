package isha.sharenurture.sharenurtureapi.service;

import isha.sharenurture.sharenurtureapi.model.Content;
import isha.sharenurture.sharenurtureapi.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContentService {

    private ContentRepository repository;

    @Autowired
    public ContentService(ContentRepository repository) {
        this.repository = repository;
    }

    public List<Content> getAllContents() {
        return repository.findAll();
    }

//    public List<FacebookGroup> getGroupsOfPrimaryVolunteer(int id) {
//        return repository.findAllByPrimaryVolunteerId(id);
//    }

}