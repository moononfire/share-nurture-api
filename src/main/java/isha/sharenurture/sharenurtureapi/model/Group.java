package isha.sharenurture.sharenurtureapi.model;

import javax.persistence.*;

@Entity
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "primary_volunteer_id")
    private Volunteer primaryVolunteer;

    public Group(int id, Volunteer primaryVolunteer) {
        this.id = id;
        this.primaryVolunteer = primaryVolunteer;
    }

    public Group() {
    }

    public int getId() {
        return id;
    }

    public Volunteer getPrimaryVolunteer() {
        return primaryVolunteer;
    }

}
