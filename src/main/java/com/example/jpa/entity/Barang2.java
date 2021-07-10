package com.example.jpa.entity;

import lombok.Data;

import javax.persistence.*;

//3) @OneToOne Example Using a Join Table

@Data
@Entity
@Table(name = "barang_2")
public class Barang2 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nama;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "barang_detail",
            joinColumns =
                    { @JoinColumn(name = "barang_id", referencedColumnName = "id") },
            inverseJoinColumns =
                    { @JoinColumn(name = "detail_id", referencedColumnName = "id") })
    private Detail2 detail2;

}
