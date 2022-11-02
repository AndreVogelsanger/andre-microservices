package br.com.andre.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public class Greeting {

    private final long id;
    private final String content;

}
