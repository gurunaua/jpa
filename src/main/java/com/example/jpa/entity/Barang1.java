package com.example.jpa.entity;

import lombok.Data;

import javax.persistence.*;


//2) @OneToOne Example Using Foreign Key

@Data
@Entity
@Table(name = "barang_1")
public class Barang1 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nama_barang_1")
    private String namaBarang1;

    @OneToOne(cascade = CascadeType.ALL)
    private Detail1 detail1;


}
