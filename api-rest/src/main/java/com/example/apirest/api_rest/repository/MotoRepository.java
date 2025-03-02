package com.example.apirest.api_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.apirest.api_rest.model.MotoEntity;

import java.util.Optional;

@Repository
public interface MotoRepository extends JpaRepository<MotoEntity,Long> {


    @Query("SELECT m FROM MotoEntity m WHERE m.id = :id AND LOWER(m.marca) = LOWER(:marca)")
    Optional<MotoEntity> findByIdAndMarcaIgnoreCase(@Param("id") Long id, @Param("marca") String marca);
}
