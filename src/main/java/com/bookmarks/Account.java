package com.bookmarks;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jfinlays on 12/28/16.
 */
@Entity
public class Account {

    public Set<Bookmark> getBookmarks() {
        return bookmarks;
    }


    @OneToMany(mappedBy = "account")
    private Set<Bookmark> bookmarks = new HashSet<Bookmark>();

    public Long getId() {
        return id;
    }

    @Id
    @GeneratedValue
    private Long id;

    @JsonIgnore
    public String password;
    public String username;

    public Account(String name, String password) {
        this.username = name;
        this.password = password;
    }

    Account(){

    }

}
