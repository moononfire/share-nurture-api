package isha.sharenurture.sharenurtureapi.repository;

import isha.sharenurture.sharenurtureapi.model.Category;
import isha.sharenurture.sharenurtureapi.model.Volunteer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    @Override
    List<Category> findAll();
}