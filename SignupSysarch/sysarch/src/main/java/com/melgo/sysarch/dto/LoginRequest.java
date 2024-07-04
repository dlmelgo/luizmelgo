package com.melgo.sysarch.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class LoginRequest {

    @Schema(description = "Email address for the account", example = "joemarie@example.com")
    private String email;

    @Schema(description = "Password for the account", example = "*****")
    private String password;
}
