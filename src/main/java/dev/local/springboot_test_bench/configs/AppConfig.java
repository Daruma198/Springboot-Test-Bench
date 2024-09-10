package dev.local.springboot_test_bench.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AppConfig {
//    @Value("${test-bench.restricted-end-point}")
//    private String endPointRestricted;
//
//    @Value("${test-bench.swagger-end-point-allowed}")
//    private String endPointSwagger;
//    @Value("${test-bench.swagger-2-end-point-allowed}")
//    private String endPointSwagger2;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager (AuthenticationConfiguration config) throws Exception{
        return config.getAuthenticationManager();
    }

//    @Bean
//    public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> webServerFactoryCustomizer() {
//        return factory -> factory.setContextPath("/asset-tetap");
//    }
//
//    @Bean
//    public ObjectMapper objectMapper() {
//        final ObjectMapper mapper = new ObjectMapper();
//        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
//        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//
//        SimpleModule dateSerialModul = new SimpleModule();
//        dateSerialModul.addSerializer(Date.class, new DateSerializerJackson());
//        mapper.registerModule(dateSerialModul);
//        return mapper;
//    }
//
//    @PostConstruct
//    void loadExcludeInterceptors() {
//        EXCLUDE_INTERCEPTORS.put(endPointRestricted + endPointSwagger, RandomStringUtils.random(10));
//        EXCLUDE_INTERCEPTORS.put(endPointRestricted + endPointSwagger2, RandomStringUtils.random(10));
//    }
}