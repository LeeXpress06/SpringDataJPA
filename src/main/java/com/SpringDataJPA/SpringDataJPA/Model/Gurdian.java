package com.SpringDataJPA.SpringDataJPA.Model;


import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Gurdian {
    private String name;
    private String email;
    private String phone;

}
