package com.tp.bike.platform.bike.infraestructure.persistence.jpa.repositories;

import com.tp.bike.platform.bike.bycicle.domain.model.aggregates.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BikeRepository extends JpaRepository<Bike,Long> {

}
