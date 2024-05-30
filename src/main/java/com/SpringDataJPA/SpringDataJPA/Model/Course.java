package com.SpringDataJPA.SpringDataJPA.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Course")
public class Course extends BaseEntity {

    private String description;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Student_Course",
            joinColumns = @JoinColumn(name = "Student_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "Course_id",referencedColumnName = "id")
    )
    private Student student;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(
            name = "teacher_Fk",
            referencedColumnName = "id"
    )
    private Teacher teacher;




}
