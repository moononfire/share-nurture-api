package isha.sharenurture.sharenurtureapi.model;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
public class Volunteer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    int id;

    String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "primaryVolunteer")
    private Set<FacebookGroup> facebookGroups;

    public Volunteer(int id) {
        this.id = id;
    }

    public Volunteer(int id, String name) {
        this.id = id;
        this.name = name;
        facebookGroups = new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /* UPDATE: actually I don't know why this does not work.
     * this can't be done because we would have to declare it as @manyToMany relationship in hibernate.
     * until then we can keep it like this in Java code, but in the database it's still a one-directional relationship.
     */
//    public Set<FacebookGroup> getGroups() {
//        return facebookGroups;
//    }
}
