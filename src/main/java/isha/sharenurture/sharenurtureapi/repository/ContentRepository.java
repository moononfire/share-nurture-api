package isha.sharenurture.sharenurtureapi.repository;

import isha.sharenurture.sharenurtureapi.model.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContentRepository extends JpaRepository<Content, Integer> {
    public List<Content> findAll();
}
