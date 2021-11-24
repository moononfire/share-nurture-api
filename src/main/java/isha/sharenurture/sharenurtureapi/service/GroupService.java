package isha.sharenurture.sharenurtureapi.service;

import isha.sharenurture.sharenurtureapi.model.Group;
import isha.sharenurture.sharenurtureapi.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {

    private GroupRepository repository;

    @Autowired
    public GroupService(GroupRepository repository) {
        this.repository = repository;
    }

//    public List<Group> getGroupsOfPrimaryVolunteerId(int id) {
//        return repository.findGroupByPrimaryVolunteerId(id);
//    }
}
