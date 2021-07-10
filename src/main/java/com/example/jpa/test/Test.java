package com.example.jpa.test;

import com.example.jpa.entity.*;
import com.example.jpa.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class Test {

    @Autowired
    OrangRepo orangRepo;

    @Autowired
    BarangRepo barangRepo;

    @Autowired
    DetailRepo detailRepo;

    @Autowired
    Barang1Repo barangRepo1;

    @Autowired
    Barang2Repo barangRepo2;

    @PostConstruct
    public void insertOrang() {
//        for (int i = 0; i < 20; i++) {
//            Orang orang = new Orang();
//            orang.setNama("ini nama orang "+i);
//            orang.setEmail("ini email orang "+i);
//            orang = orangRepo.save(orang);
//            System.out.println("reseult : " + orang);
//        }
//
//        List<Orang> orangList = (List<Orang>) orangRepo.findAll();
//        for (Orang orang: orangList) {
//            System.out.println("orang : " + orang);
//        }

//        @OneToOne Example Using Shared Primary Key
//        Barang barang = new Barang();
//        Detail detail = new Detail();
//
//        detail.setDetailBarang("deatail barang");
//        barang.setNama("nama barang");
//        barang.setDetail(detail);
//        detail.setBarang(barang);
//
//        barangRepo.save(barang);



//        2) @OneToOne Example Using Foreign Keys

//        Barang1 barang1 = new Barang1();
//        Detail1 detail1 = new Detail1();
//        barang1.setNamaBarang1("nama barang 1");
//        detail1.setNamaDetail1("nama detail 1");
//        barang1.setDetail1(detail1);
//        barangRepo1.save(barang1);


//        3) @OneToOne Example Using a Join Table

        Barang2 barang2 = new Barang2();
        Detail2 detail2 = new Detail2();
        barang2.setNama("nama  1");
        detail2.setDetailBarang("nama detail 1");
        barang2.setDetail2(detail2);
        barangRepo2.save(barang2);
    }


}
