package com.muizz.spring.mediator.configuration;

import org.springframework.context.annotation.PropertySource;

@PropertySource(value = "classpath:springmediator-application.yaml", factory = YamlPropertySourceFactory.class)
public class SpringMediatorConfig {
    
}
