package com.example.apirest.api_rest.helper;

import com.example.apirest.api_rest.model.MotoEntity;
import com.example.apirest.api_rest.model.dto.MotoDto;

public interface MotoHelperI {

    public MotoDto toDto(MotoEntity motoEntity);
}
