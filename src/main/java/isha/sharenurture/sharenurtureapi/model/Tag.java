package isha.sharenurture.sharenurtureapi.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String tag;

    @ManyToOne
    @JoinColumn(name = "content_id")
    //TODO: fix this because I think this should not be done as JoinColumn like this. In this scenario we keep very many records in the Tag table, we should create a Content_Tag table..
    private Content content;
}