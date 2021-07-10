package com.example.jpa.entity;

import lombok.Data;
import javax.persistence.*;

//1 @OneToOne Example Using Shared Primary Key

@Data
@Entity
@Table(name = "barang")
public class Barang {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nama;

    @OneToOne(mappedBy = "barang", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Detail detail;

}
