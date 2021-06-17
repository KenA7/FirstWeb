package com.example.firstweb.model;


import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Table("customer")
@Entity
public class Customer {

    @Column("id")
    private @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id;

    @Column("first_name")
    private String firstName;

    @Column("last_name")
    private String lastName;

    @Column("email")
    private String email;

    @Column("birthday")
    private Date dob;


}
