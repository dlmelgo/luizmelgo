package com.melgo.sysarch.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class SignUpRequest {

    @Schema(description = "Username for the new account", example = "john_doe")
    private String username;

    @Schema(description = "Password for the new account", example = "password123")
    private String password;

    @Schema(description = "Confirm password for the new account", example = "password123")
    private String confirmPassword;

    @Schema(description = "Email address for the new account", example = "john.doe@example.com")
    private String email;

    @Schema(description = "Phone number for the new account", example = "+1234567890")
    private String phoneNumber;
}
