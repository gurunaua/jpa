package com.example.jpa.entity;

import lombok.Data;
import javax.persistence.*;

//1 @OneToOne Example Using Shared Primary Key

@Data
@Entity
@Table(name = "detail")
public class Detail {

    @Id
    private Integer id;

    @Column(name = "detail_barang")
    private String detailBarang;

    @OneToOne
    @MapsId
    private Barang barang;
}
