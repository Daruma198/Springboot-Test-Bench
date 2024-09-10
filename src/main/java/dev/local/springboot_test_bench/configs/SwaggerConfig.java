package dev.local.springboot_test_bench.configs;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class SwaggerConfig {
    @Value("${test-bench.openapi.dev-url}")
    private String devUrl;

    @Value("${test-bench.openapi.prod-url}")
    private String prodUrl;
}