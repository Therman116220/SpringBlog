package com.project.review;

import org.springframework.data.repository.CrudRepository;

/*Crud Repo accepts Generics*/ /*This will inject sensical/logical implementations for CRUD automatically*/
/*Crud repo  |IS-OF (Review Class)| , |ID TYPE (Long)| */
public interface ReviewRepository extends CrudRepository<Review, Long> {



}
