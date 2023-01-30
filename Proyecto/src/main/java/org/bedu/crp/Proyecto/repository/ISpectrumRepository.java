package org.bedu.crp.Proyecto.repository;


import org.bedu.crp.Proyecto.model.Spectrum;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ISpectrumRepository extends JpaRepositoryImplementation<Spectrum, Long> {
    public List<Spectrum> findByNameIgnoreCaseContaining(@Param("name")String name);

}
