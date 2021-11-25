package isha.sharenurture.sharenurtureapi.service;

import isha.sharenurture.sharenurtureapi.model.FacebookGroup;
import isha.sharenurture.sharenurtureapi.model.Tag;
import isha.sharenurture.sharenurtureapi.repository.GroupRepository;
import isha.sharenurture.sharenurtureapi.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {

    private TagRepository repository;

    @Autowired
    public TagService(TagRepository repository) {
        this.repository = repository;
    }

    public List<Tag> getAllTags() {
        return repository.findAll();
    }

//    public List<FacebookGroup> getGroupsOfPrimaryVolunteer(int id) {
//        return repository.findAllByPrimaryVolunteerId(id);
//    }

}