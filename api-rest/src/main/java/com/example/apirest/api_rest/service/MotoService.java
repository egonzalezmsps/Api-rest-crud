package com.example.apirest.api_rest.service;


import com.example.apirest.api_rest.bean.MotoResponse;
import com.example.apirest.api_rest.helper.MotoHelperI;
import com.example.apirest.api_rest.model.MotoEntity;
import com.example.apirest.api_rest.model.dto.MotoDto;
import com.example.apirest.api_rest.repository.MotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class MotoService implements MotoServiceI {


   @Autowired
    private MotoRepository motoRepository;
@Autowired
private MotoHelperI motoHelperI;

    @Override
    public MotoResponse createdMoto(MotoEntity motoEntity) {
     motoRepository.save(motoEntity);
     return new MotoResponse(motoEntity.getId(), "Successfully created");
    }

    public MotoDto getMotos(Long id, String marca) {

        Optional<MotoEntity> motoEntity = motoRepository.findByIdAndMarcaIgnoreCase(id, marca);
        if (motoEntity.isPresent()) {
            return motoHelperI.toDto(motoEntity.get());
        } else {
            throw new RuntimeException("Moto no encontrada con id: " + id + " y marca: " + marca);
        }
    }



    @Override
    public MotoResponse updateMoto(Long id) {
        return null;
    }

    @Override
    public MotoResponse deleteMoto(Long id) {
        return null;
    }
}

//enoc""
