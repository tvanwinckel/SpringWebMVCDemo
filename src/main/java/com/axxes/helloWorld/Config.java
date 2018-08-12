package com.axxes.helloWorld;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    /**
     * This Bean allows us to set a default context path for our web application.
     *
     * Tip: you can set the property 'server.servlet.path=/axxes' to get the same result
     */

    @Bean
    public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> webServerFactoryCustomizer() {
        return factory -> factory.setContextPath("/axxes");
    }


}
