package com.project.review;


import com.project.course.Course;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Review {
    protected  final Long id;

    protected Review() {
        id = null;
    }
    private int rating;
    private String description;



    /*Temp-Fix for LINE 9's issue with Super Class  */
    public Review() {
        super();
    }

    /*Rating Get/Set*/
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }


    /*Desc Get-Set*/
    public String getDescription() {
        @GeneratedValue(strategy = GenerationType.AUTO)
        private final long id;

        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }








}
