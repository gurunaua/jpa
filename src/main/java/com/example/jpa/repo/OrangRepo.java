package com.example.jpa.repo;

import com.example.jpa.entity.Orang;
import org.springframework.data.repository.CrudRepository;

public interface OrangRepo extends CrudRepository<Orang, Integer> {

}
