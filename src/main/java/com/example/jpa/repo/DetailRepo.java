package com.example.jpa.repo;

import com.example.jpa.entity.Detail;
import com.example.jpa.entity.Orang;
import org.springframework.data.repository.CrudRepository;

public interface DetailRepo extends CrudRepository<Detail, Integer> {

}
