package com.Dhanu.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Dhanu.model.Marks;
@Repository
public interface MarksRepo extends CrudRepository<Marks, Integer> {

}
