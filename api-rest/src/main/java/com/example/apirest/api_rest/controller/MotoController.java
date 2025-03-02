package com.example.apirest.api_rest.controller;



import com.example.apirest.api_rest.bean.MotoResponse;
import com.example.apirest.api_rest.model.MotoEntity;
import com.example.apirest.api_rest.model.dto.MotoDto;
import com.example.apirest.api_rest.service.MotoServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("api/v1/")
public class MotoController {

    @Autowired
    private MotoServiceI motoService;

    @PostMapping
    public ResponseEntity<MotoResponse> createMoto(@RequestBody MotoEntity motoEntity) {
        MotoResponse motoVar = motoService.createdMoto(motoEntity);
        return ResponseEntity.ok(motoVar);
    }

    @GetMapping("/buscar")
    public ResponseEntity<MotoDto> getMotoByIdAndMarca(
            @RequestParam(required = false) Long id, // El ID es opcional
            @RequestParam(required = false) String marca) { // La marca es obligatoria
        MotoDto motoDto = motoService.getMotos(id, marca);
        return ResponseEntity.ok(motoDto);
    }
}
