package com.project.course;

import org.springframework.data.repository.CrudRepository;


/*Crud Repo accepts Generics*/ /*This will inject sensical/logical implementations for CRUD automatically*/
/*Crud repo  |IS-OF (Review Class)| , |ID TYPE (Long)| */
public interface CourseRepository extends CrudRepository<Course, Long> {
}
