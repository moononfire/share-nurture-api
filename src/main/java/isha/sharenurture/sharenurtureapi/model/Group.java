package isha.sharenurture.sharenurtureapi.model;

import javax.persistence.*;

@Entity
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRIMARY_VOLUNTEER_ID")
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

    public void setId(int id) {
        this.id = id;
    }

    public void setPrimaryVolunteer(Volunteer primaryVolunteer) {
        this.primaryVolunteer = primaryVolunteer;
    }

    public Volunteer getPrimaryVolunteer() {
        return primaryVolunteer;
    }

}
