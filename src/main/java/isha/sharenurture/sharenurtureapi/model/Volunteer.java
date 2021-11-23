package isha.sharenurture.sharenurtureapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Volunteer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    String name;

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
}
