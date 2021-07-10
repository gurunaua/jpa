package com.example.jpa.repo;

import com.example.jpa.entity.Barang;
import com.example.jpa.entity.Detail1;
import org.springframework.data.repository.CrudRepository;

public interface BarangRepo extends CrudRepository<Barang, Integer> {

}
