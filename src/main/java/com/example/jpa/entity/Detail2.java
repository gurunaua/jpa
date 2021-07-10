package com.example.jpa.entity;

import lombok.Data;

import javax.persistence.*;

//3) @OneToOne Example Using a Join Table

@Data
@Entity
@Table(name = "detail_2")
public class Detail2 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "detail_barang")
    private String detailBarang;

    @OneToOne(mappedBy = "detail2")
    private Barang2 barang2;
}
