package com.devroom.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.devroom.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student,Long>{

}
