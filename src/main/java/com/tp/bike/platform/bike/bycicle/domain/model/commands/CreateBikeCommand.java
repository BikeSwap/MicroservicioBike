package com.tp.bike.platform.bike.bycicle.domain.model.commands;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.util.Date;

public record CreateBikeCommand(String name,
                                String description,
                                double price,
                                String model,
                                String image) {
}
