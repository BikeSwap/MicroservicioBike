package com.tp.bike.platform.bike.bycicle.application.internal.queryServices;


import com.tp.bike.platform.bike.bycicle.domain.model.aggregates.Bike;
import com.tp.bike.platform.bike.bycicle.domain.model.querys.GetBikeById;
import com.tp.bike.platform.bike.bycicle.domain.services.BikeQueryService;
import com.tp.bike.platform.bike.infraestructure.persistence.jpa.repositories.BikeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BikeQueryServiceImpl implements BikeQueryService {
    private final BikeRepository bikeRepository;

    public BikeQueryServiceImpl(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    @Override
    public Optional<Bike> handle(GetBikeById query) {
        return bikeRepository.findById(query.id());
    }

    @Override
    public List<Bike> getAllBikes() {
        return bikeRepository.findAll();
    }
}
