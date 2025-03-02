package com.example.apirest.api_rest.controller;

import com.example.apirest.api_rest.service.MotoService;
import com.example.apirest.api_rest.model.Moto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/motos")
public class MotoController {
    @Autowired
    private MotoService motoService;

   @PostMapping
    public Moto createMotos( @RequestBody Moto moto ) {
       return motoService.createMoto(moto);
    }
    @GetMapping
    public List<Moto> getAllMotos() {
       return motoService.getAllMotos();
    }

    @GetMapping("{id}")
    public Moto searchById(@PathVariable("id") Long id) {
       return motoService.getByMoto(id);
    }
    @DeleteMapping("{id}") // Especifica el {id} en la ruta
    public void deleteMoto(@PathVariable("id") Long id) { // Asegúrate de que el nombre coincida
        motoService.deleteMoto(id);
    }
    @PutMapping("{id}")
    public Moto updateMoto(@PathVariable("id") Long id, @RequestBody Moto moto) {
        return motoService.updateMoto(id, moto);
    }

}
