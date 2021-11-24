package isha.sharenurture.sharenurtureapi.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Volunteer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String name;

    @OneToMany(mappedBy = "primaryVolunteer", cascade = CascadeType.ALL)
    private Set<Group> groups;

    public Volunteer() {

    }

    public Volunteer(int id) {
        this.id = id;
    }

    public Volunteer(int id, String name) {
        this.id = id;
        this.name = name;
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

//    public Set<Group> getGroups() {
//        return groups;
//    }
//
//    public void setGroups(Set<Group> groups) {
//        this.groups = groups;
//    }
}
