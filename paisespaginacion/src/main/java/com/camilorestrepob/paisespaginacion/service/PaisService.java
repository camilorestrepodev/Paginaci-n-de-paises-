package com.camilorestrepob.paisespaginacion.service;

import com.camilorestrepob.paisespaginacion.entity.Pais;
import com.camilorestrepob.paisespaginacion.repository.PaisRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.beans.Transient;

@Service
@Transactional
public class PaisService {
    @Autowired
    PaisRepository paisRepository;

    public Page<Pais> paginas(Pageable pageable){
    return paisRepository.findAll(pageable);
    }
}