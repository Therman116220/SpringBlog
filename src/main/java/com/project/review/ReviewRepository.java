package com.project.review;

import org.springframework.data.repository.CrudRepository;


/*Crud repo  |IS-OF (Review Class)| , |ID TYPE (Long)| */
public interface ReviewRepository extends CrudRepository<Review, Long> {



}
