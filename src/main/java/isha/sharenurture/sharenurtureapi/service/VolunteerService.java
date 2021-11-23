package isha.sharenurture.sharenurtureapi.service;

import isha.sharenurture.sharenurtureapi.model.Volunteer;
import isha.sharenurture.sharenurtureapi.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class VolunteerService {

    private VolunteerRepository repository;

    @Autowired
    public VolunteerService(VolunteerRepository repository) {
        this.repository = repository;
    }

    public Volunteer getVolunteer(int id) {
        return repository.findById(id).orElseThrow(NoSuchElementException::new);
    }
}
