package com.travlej.backend.postrequest.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan(basePackages = "com.travlej.backend.postrequest")
public class JPAConfiguration {
}
