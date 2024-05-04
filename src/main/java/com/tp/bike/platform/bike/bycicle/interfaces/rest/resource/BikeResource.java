package com.tp.bike.platform.bike.bycicle.interfaces.rest.resource;

import java.util.Date;

public record BikeResource(Long id,
                           String name,
                           String description,
                           double price,
                           String model,
                           String image) {
}
