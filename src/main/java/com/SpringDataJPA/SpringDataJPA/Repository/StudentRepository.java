package com.SpringDataJPA.SpringDataJPA.Repository;

import com.SpringDataJPA.SpringDataJPA.Model.Student;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>, Specification<Student> {

    Optional<Student> findOne(Specification<Student> specification);
    Student findAll(Specification<Student>specification);




}
