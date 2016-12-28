package com.bookmarks;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.awt.print.Book;

/**
 * Created by jfinlays on 12/28/16.
 */

@Entity
public class Bookmark {

    @JsonIgnore
    @ManyToOne
    private Account account;

    @Id
    @GeneratedValue
    private Long id;

    Bookmark(){

    }

    public Bookmark(Account account, String uri, String description) {
        this.account = account;
        this.uri = uri;
        this.description = description;
    }

    public String uri;
    public String description;

    public String getUri() {
        return uri;
    }

    public String getDescription() {
        return description;
    }

}
