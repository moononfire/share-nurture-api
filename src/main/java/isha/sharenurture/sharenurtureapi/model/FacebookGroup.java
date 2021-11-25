package isha.sharenurture.sharenurtureapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "facebook_group")
public class FacebookGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "primary_volunteer_id")
    @JsonManagedReference
    private Volunteer primaryVolunteer;

    @ManyToOne
    @JoinColumn(name = "secondary_volunteer_id")
    @JsonManagedReference
    private Volunteer secondaryVolunteer;

    @OneToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
