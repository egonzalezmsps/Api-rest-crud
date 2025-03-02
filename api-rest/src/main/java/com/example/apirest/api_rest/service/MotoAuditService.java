package com.example.apirest.api_rest.service;

import com.example.apirest.api_rest.model.Moto;
import org.hibernate.envers.AuditReader;
import org.hibernate.envers.AuditReaderFactory;
import org.hibernate.envers.query.AuditEntity;
import org.hibernate.envers.query.AuditQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager; // Import correcto para Spring Boot 3.x
import java.util.List;

@Service
public class MotoAuditService {

    @Autowired
    private EntityManager entityManager;

    public List<Moto> getMotoRevisions(Long motoId) {
        AuditReader auditReader = AuditReaderFactory.get(entityManager);
        AuditQuery query = auditReader.createQuery()
                .forRevisionsOfEntity(Moto.class, false, true)
                .add(AuditEntity.id().eq(motoId));
        return query.getResultList();
    }
}