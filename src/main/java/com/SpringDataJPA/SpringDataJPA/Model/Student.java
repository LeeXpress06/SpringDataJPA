package com.SpringDataJPA.SpringDataJPA.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter
@Table(name = "Student")
@AllArgsConstructor
@NoArgsConstructor
public class Student {



    @Id
    @GeneratedValue
//    @SequenceGenerator(name = "student_sequence",
//            sequenceName = "student_sequence",
//            allocationSize = 1,
//            initialValue = 2)
//    @TableGenerator(
//            name = "student_idGenerator",
//            table = "Id_generator",
//            pkColumnName = "primary_key",
//            pkColumnValue = "value_key",
//            allocationSize = 1,
//            initialValue = 1
//    )
    private Long id;
    private String name;
    @Column(name = "Email")
    private String student_email;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride ( name = "name", column = @Column(name = "FatherName")),
            @AttributeOverride( name ="email", column = @Column(name = "FatherEmail")),
            @AttributeOverride(name = "phone", column = @Column(name = "FatherPhone"))
    })
    private Gurdian father;
    @Embedded
    @AttributeOverrides({
         @AttributeOverride(name = "name",column = @Column(name = "MotherName")),
         @AttributeOverride(name = "email",column = @Column(name = "MotherEmail")),
         @AttributeOverride(name = "phone",column = @Column(name = "MotherPhone"))
    })
    private Gurdian mother;

    @ManyToMany(mappedBy = "student", fetch = FetchType.LAZY)
    private Course courses;




}
