package br.com.andre.configuration;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.inject.Named;


@Component @ConfigurationProperties("greeting-service")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@Named
public class GreetingConfiguration {

    private String greeting;
    private String defaultValue;

}
