package com.tp.bike.platform.bike.bycicle.domain.model.aggregates;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@EntityListeners(AuditingEntityListener.class)
@Entity
@Getter
@Setter
public class Bike {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    @Getter
    private String name;

    @NotNull
    @NotBlank
    @Getter
    private String description;

    @NotNull
    @NotBlank
    @Getter
    private double price;

    @NotNull
    @NotBlank
    @Getter
    private String model;

    @NotNull
    @Getter
    private String image;
}
