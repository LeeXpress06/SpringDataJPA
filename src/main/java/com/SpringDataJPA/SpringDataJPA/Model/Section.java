package com.SpringDataJPA.SpringDataJPA.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Section")
@NamedQuery(
        name = "sectionName", query = "select s from section s where s.name = :name "
)
public class Section {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "name")
    private String section_name;
    private String building;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "course_fk",
            referencedColumnName = "id"
    )
    private Course course;

}
