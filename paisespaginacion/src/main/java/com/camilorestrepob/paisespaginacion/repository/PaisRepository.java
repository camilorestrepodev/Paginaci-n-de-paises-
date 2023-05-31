package com.camilorestrepob.paisespaginacion.repository;

import com.camilorestrepob.paisespaginacion.entity.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long> {
}
