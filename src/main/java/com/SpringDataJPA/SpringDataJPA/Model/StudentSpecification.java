package com.SpringDataJPA.SpringDataJPA.Model;

import org.springframework.data.jpa.domain.Specification;

public class StudentSpecification {


    public static Specification<Student> hasName( String name){

        return ( (root, query, criteriaBuilder) ->
                   criteriaBuilder.equal(root.get("name"), name)
                );
    }
   public static  Specification<Student> hasEmail(String email){

        return (root, query, criteriaBuilder) -> (
            criteriaBuilder.equal(root.get("email"), email)
        );
   }

    public static  Specification<Student> hasEmailAndName(String name , String email ){

        return Specification.where(hasName(name).and(hasEmail(email)));
    }
}
