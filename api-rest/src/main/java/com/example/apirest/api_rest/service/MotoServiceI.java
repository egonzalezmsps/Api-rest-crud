package com.example.apirest.api_rest.service;

import com.example.apirest.api_rest.bean.MotoResponse;
import com.example.apirest.api_rest.model.MotoEntity;
import com.example.apirest.api_rest.model.dto.MotoDto;

public interface MotoServiceI {

    public MotoResponse createdMoto(MotoEntity motoEntity);
    public MotoDto getMotos(Long id,String marca);
    public MotoResponse updateMoto(Long id);
    public MotoResponse deleteMoto(Long id);


}
