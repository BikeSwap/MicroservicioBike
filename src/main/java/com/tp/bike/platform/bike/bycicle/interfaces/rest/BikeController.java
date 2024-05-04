package com.tp.bike.platform.bike.bycicle.interfaces.rest;

import com.tp.bike.platform.bike.bycicle.domain.model.aggregates.Bike;
import com.tp.bike.platform.bike.bycicle.domain.model.querys.GetBikeById;
import com.tp.bike.platform.bike.bycicle.domain.services.BikeQueryService;
import com.tp.bike.platform.bike.bycicle.interfaces.rest.resource.BikeResource;
import com.tp.bike.platform.bike.bycicle.interfaces.rest.transform.BikeResourceFromEntityAssembler;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/bikes", produces = MediaType.APPLICATION_JSON_VALUE)
@Validated
public class BikeController {
    private final BikeQueryService bikeQueryService;

    public BikeController(BikeQueryService bikeQueryService) {
        this.bikeQueryService = bikeQueryService;
    }


    @GetMapping("/{bikeId}")
    public ResponseEntity<BikeResource> getSongById(@PathVariable Long bikeId){
        var getBikeByIdQuery = new GetBikeById(bikeId);
        var bike = bikeQueryService.handle(getBikeByIdQuery);

        if(bike.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        var bikeResource = BikeResourceFromEntityAssembler.toResourceFromEntity(bike.get());
        return ResponseEntity.ok(bikeResource);
    }
    @GetMapping
    public List<Bike> getAll() {
        return bikeQueryService.getAllBikes();
    }
}
