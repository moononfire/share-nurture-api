package isha.sharenurture.sharenurtureapi.service;

import isha.sharenurture.sharenurtureapi.model.FacebookGroup;
import isha.sharenurture.sharenurtureapi.repository.FacebookGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {

    private FacebookGroupRepository repository;

    @Autowired
    public GroupService(FacebookGroupRepository repository) {
        this.repository = repository;
    }

    public List<FacebookGroup> getAllGroups() {
        return repository.findAll();
    }

    public List<FacebookGroup> getGroupsOfPrimaryVolunteer(int id) {
        return repository.findAllByPrimaryVolunteerId(id);
    }

}
