package isha.sharenurture.sharenurtureapi.repository;

import isha.sharenurture.sharenurtureapi.model.FacebookGroup;
import isha.sharenurture.sharenurtureapi.model.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupRepository extends JpaRepository<FacebookGroup, Integer> {

    @Query("select groups from FacebookGroup groups where groups.primaryVolunteer.id = :primaryVolunteerId")
    List<FacebookGroup> findAllByPrimaryVolunteerId(int primaryVolunteerId);
}
