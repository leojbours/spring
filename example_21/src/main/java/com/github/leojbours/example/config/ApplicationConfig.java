package com.github.leojbours.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ApiVersionConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ApplicationConfig implements WebMvcConfigurer {
    @Override
    public void configureApiVersioning(ApiVersionConfigurer configurer) {
//        configurer.usePathSegment(1);
//        configurer.useQueryParam("version");
//        configurer.useRequestHeader("API-VERSION");
        configurer.useMediaTypeParameter(MediaType.parseMediaType( "application/vnd.leojbours+json" ), "v");
    }
}
