package isha.sharenurture.sharenurtureapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String tag;

    @ManyToMany(cascade = { CascadeType.ALL }/*, fetch = FetchType.LAZY, mappedBy = "content"*/)
    @JoinTable(
            name = "Tags_Contents",
            joinColumns = { @JoinColumn(name = "tag_id") },
            inverseJoinColumns = { @JoinColumn(name = "content_id") }
    )
    @JsonBackReference
    //TODO: fix this because I think this should not be done as JoinColumn like this. In this scenario we keep very many records in the Tag table, we should create a Content_Tag table..
    private Set<Content> contents;
}