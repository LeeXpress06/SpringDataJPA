package com.SpringDataJPA.SpringDataJPA.Service;


import com.SpringDataJPA.SpringDataJPA.Model.Student;
import com.SpringDataJPA.SpringDataJPA.Model.StudentSpecification;
import com.SpringDataJPA.SpringDataJPA.Repository.StudentRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // find one student
    public Student getStudentByName(String name ){

        Specification<Student> specification = StudentSpecification.hasName(name);

        return studentRepository.findOne(specification).get();

    }
   // find all student
    public Student getAllStudentsByNAme(String name ){

        Specification<Student> spec = StudentSpecification.hasName(name);

        return studentRepository.findAll(spec);

    }

    // find by user name and email
    public Student getByUserNameAndName(String name , String email ){

       Specification<Student> specification = StudentSpecification
               .hasName(name)
               .and(StudentSpecification.hasEmail(email));

       return studentRepository.findAll(specification);

    }





}
