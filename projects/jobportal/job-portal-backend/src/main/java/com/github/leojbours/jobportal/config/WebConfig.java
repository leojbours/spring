package com.github.leojbours.jobportal.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ApiVersionConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

  @Override
  public void configureApiVersioning(ApiVersionConfigurer configurer) {
    configurer.addSupportedVersions("1.0.0");
    configurer.useMediaTypeParameter(MediaType.parseMediaType("application/vnd.leojbours+json"), "v");
  }
}
