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
@Table(name = "Teacher")
public class Teacher {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String department;
    @OneToMany(mappedBy = "teacher", fetch = FetchType.LAZY)
    private Course course;
}
