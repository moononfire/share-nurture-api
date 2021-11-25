package isha.sharenurture.sharenurtureapi.repository;

import isha.sharenurture.sharenurtureapi.model.Tag;
import isha.sharenurture.sharenurtureapi.model.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TagRepository extends JpaRepository<Tag, Integer> {

    @Override
    List<Tag> findAll();
}
