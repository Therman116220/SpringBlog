package com.project.course;
/*Imports*/

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final long id;
 private String title;

    public String getTitle() {
        return title;
    }



    public Course(String title, String url) {
        this();
        this.title = title;
        this.url = url;
    }

    public void setTitle(String title) {
        this.title = title;
    }




    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private String url;

 protected Course(long id) {

     this.id = id;
 }






}
