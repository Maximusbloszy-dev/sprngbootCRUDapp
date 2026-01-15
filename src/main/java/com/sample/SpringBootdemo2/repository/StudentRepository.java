package com.sample.SpringBootdemo2.repository;

import com.sample.SpringBootdemo2.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel,Integer> {
}
