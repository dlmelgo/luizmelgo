package com.melgo.sysarch.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class BangkaRequest {

    @Schema(description = "Name of the Bangka", example = "Bangka ni Joem")
    private String name;

    @Schema(description = "Price of the Bangka", example = "150000.00")
    private double price;

    @Schema(description = "Port area where the Bangka is located", example = "Port 1")
    private String portArea;
}
