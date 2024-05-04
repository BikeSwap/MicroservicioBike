package com.tp.bike.platform.bike.bycicle.domain.model.commands;

import java.util.Date;

public record CreateBikeCommand(String name, String musicBand, String singer, Date publication, String rhythm, String disk, String city, String country) {
}
