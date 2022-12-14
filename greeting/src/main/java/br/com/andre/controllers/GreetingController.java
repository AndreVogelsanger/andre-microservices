package br.com.andre.controllers;

import br.com.andre.configuration.GreetingConfiguration;
import br.com.andre.model.Greeting;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@AllArgsConstructor
public class GreetingController {

    private static final String template = "%s, %s";
    private final AtomicLong counter = new AtomicLong();

    private final GreetingConfiguration configuration;

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam( value = "name", defaultValue = "") String name){

        if (name.isEmpty()) name = configuration.getDefaultValue();

        return new Greeting(counter.incrementAndGet(),String.format(template,configuration.getGreeting(),name));
    }

}
