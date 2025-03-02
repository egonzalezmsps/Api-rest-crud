package com.example.apirest.api_rest.helper;

import com.example.apirest.api_rest.model.MotoEntity;
import com.example.apirest.api_rest.model.dto.MotoDto;
import org.springframework.stereotype.Component;

@Component
public class MotoHelper implements MotoHelperI{

    @Override
    public MotoDto toDto(MotoEntity motoEntity) {
        MotoDto motoDto = new MotoDto();
        motoDto.setId(motoEntity.getId());
        motoDto.setMarca(motoEntity.getMarca());
        motoDto.setModelo(motoEntity.getModelo());
        motoDto.setColor(motoEntity.getColor());
        motoDto.setCilindrada(motoEntity.getCilindrada());
        motoDto.setCreatedAt(motoEntity.getCreatedAt());
        motoDto.setCreatedBy(motoEntity.getCreatedBy());
        motoDto.setLastModifiedAt(motoEntity.getLastModifiedAt());
        motoDto.setLastModifiedBy(motoEntity.getLastModifiedBy());
        return motoDto;
    }
}
