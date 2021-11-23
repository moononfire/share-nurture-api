package isha.sharenurture.sharenurtureapi;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VolunteerRepository extends CrudRepository<Volunteer, Integer> {

    @Override
    Optional<Volunteer> findById(Integer integer);
}
