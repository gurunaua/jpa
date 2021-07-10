package com.example.jpa.entity;


import lombok.Data;

import javax.persistence.*;

//2) @OneToOne Example Using Foreign Key

@Data
@Entity
@Table(name = "detail_1")
public class Detail1 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nama_detail_1")
    private String namaDetail1;

    @OneToOne(mappedBy = "detail1")
    private Barang1 barang1;

}
