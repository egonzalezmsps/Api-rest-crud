package com.example.apirest.api_rest.controller;

import com.example.apirest.api_rest.model.Moto;
import com.example.apirest.api_rest.service.MotoAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/motos/audit")
public class MotoAuditController {

    @Autowired
    private MotoAuditService motoAuditService;

    @GetMapping("{id}")
    public List<Moto> getMotoRevisions(@PathVariable("id") Long id) {
        return motoAuditService.getMotoRevisions(id);
    }
}