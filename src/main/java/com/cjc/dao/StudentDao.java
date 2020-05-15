package com.cjc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Student;

@Repository
public interface StudentDao extends CrudRepository<Student, Integer> {

	Student findAllByUserAndPass(String user,String pass);
          
    
}
