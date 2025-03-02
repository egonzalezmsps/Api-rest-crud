package com.example.apirest.api_rest.service;

import com.example.apirest.api_rest.model.Moto;
import com.example.apirest.api_rest.repository.MotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MotoService {
   @Autowired
    private MotoRepository motoRepository;

   public Moto createMoto(Moto moto) {
       return motoRepository.save(moto);
   }

   public Moto getByMoto(Long id) {
       Optional<Moto> optionalMoto = motoRepository.findById(id);
        return optionalMoto.get();
   }

   public List<Moto> getAllMotos() {
       return motoRepository.findAll();
   }

   public void deleteMoto(Long id) {
       motoRepository.deleteById(id);
   }
    public Moto updateMoto(Long id, Moto moto) {

        Optional<Moto> optionalMoto = motoRepository.findById(id);
        if (optionalMoto.isPresent()) {
            Moto existingMoto = optionalMoto.get();
            existingMoto.setMarca(moto.getMarca());
            existingMoto.setModelo(moto.getModelo());
            existingMoto.setColor(moto.getColor());
            existingMoto.setCilindrada(moto.getCilindrada());
            return motoRepository.save(existingMoto);
        } else {
            throw new RuntimeException("Moto no encontrada con ID: " + id);
        }
    }

}
