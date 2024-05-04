package com.tp.bike.platform.bike.bycicle.interfaces.rest.resource;

import java.util.Date;

public record BikeResource(Long id, String name, String musicBand, String singer, Date publication, String rhythm, String disk, String city, String country) {
}
