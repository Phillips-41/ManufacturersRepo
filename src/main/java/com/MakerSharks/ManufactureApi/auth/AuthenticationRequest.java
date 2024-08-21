package com.MakerSharks.ManufactureApi.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AuthenticationRequest {
    @NotEmpty(message = "please fill the details")
    @NotBlank(message = "please fill the details")
    @Email(message = "email is not formatted")
    private String email;
    @NotEmpty(message = "please fill the details")
    @NotBlank(message = "please fill the details")
    @Size(min = 8,message = "8 characters minimum")
    private String password;
}
