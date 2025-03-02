package com.example.apirest.api_rest.repository;

import com.example.apirest.api_rest.model.Moto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotoRepository extends JpaRepository<Moto,Long> {

}
