package com.example.demo;

import jakarta.validation.constraints.NotBlank;

public record Newreq(
    @NotBlank String request
) {}
