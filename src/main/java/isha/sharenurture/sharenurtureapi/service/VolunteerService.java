package isha.sharenurture.sharenurtureapi.service;

import isha.sharenurture.sharenurtureapi.model.Volunteer;
import isha.sharenurture.sharenurtureapi.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class VolunteerService {

    private VolunteerRepository volunteerRepository;
    private GroupService groupService;

    @Autowired
    public VolunteerService(VolunteerRepository repository, GroupService groupService) {
        this.volunteerRepository = repository;
        this.groupService = groupService;
    }

    public Volunteer getVolunteer(int id) {
        return volunteerRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }
//
//    public List<Group> getVolunteerGroups(int id) {
//        return groupService.getGroupsOfPrimaryVolunteerId(id);
//    }
}
