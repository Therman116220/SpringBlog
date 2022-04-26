package com.codeup.springblog;

import javax.persistence.*;

@Entity
@Table(name="spring_ads")
public class Post {

    @Id

    @GeneratedValue(strategy =  GenerationType.IDENTITY)
        private long id;
    @Column(nullable = false, length = 50)
        private String  title;
    @Column (nullable = false)
        private String description;

    @ManyToOne
    @JoinColumn( name = "user_id")
    private User user;

    public Post(long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }
    public Post(String title, String description){
        this.title =title;
        this.description = description;
    }

    public Post(User user, String title, String description){
        this.user = user;
        this.title = title;
        this.description =description;
    }


    public Post(){};

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
