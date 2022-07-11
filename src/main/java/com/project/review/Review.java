package com.project.review;


import com.project.course.Course;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long id;
/*? Shouldn't this initilization (LINE17)  fix LINE16 ?*/
    protected Review() {
       id = null;
    }

    private int rating;
    private String description;



    /*Get-Set*/
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /*------*/

    /*JPA  --Java Persistance API*//*
    protected Review() {

    }*/

    public Review(int rating, String description) {
        this.rating = rating;
        this.description = description;
    }
}



