package com.tp.bike.platform.bike.bycicle.domain.model.commands;

import java.util.Date;

public record CreateBikeCommand(String name, String description, Double price, String model, String image) {
}
