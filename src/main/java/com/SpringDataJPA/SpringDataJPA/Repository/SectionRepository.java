package com.SpringDataJPA.SpringDataJPA.Repository;

import com.SpringDataJPA.SpringDataJPA.Model.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SectionRepository extends JpaRepository<Section,Long> {

     @Query(name = "sectionNamed")
     Section findByname(@Param("name") String name);

}
