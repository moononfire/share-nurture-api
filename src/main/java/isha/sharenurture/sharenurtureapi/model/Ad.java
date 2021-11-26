package isha.sharenurture.sharenurtureapi.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
public class Ad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String url;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    private String type;

    private String language;

    @ManyToMany(mappedBy = "contents")
    @JsonManagedReference
    private Set<Tag> tags;
}