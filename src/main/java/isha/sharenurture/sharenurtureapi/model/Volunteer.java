package isha.sharenurture.sharenurtureapi.model;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Volunteer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String name;

    @OneToMany(mappedBy = "primaryVolunteer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Group> groups;

    public Volunteer() {

    }

    public Volunteer(int id) {
        this.id = id;
    }

    public Volunteer(int id, String name) {
        this.id = id;
        this.name = name;
        groups = new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Group> getGroups() {
        return groups;
    }
//
//    public void setGroups(Set<Group> groups) {
//        this.groups = groups;
//    }
}
