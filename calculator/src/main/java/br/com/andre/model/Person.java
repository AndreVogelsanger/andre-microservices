package br.com.andre.model;


import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Person implements Serializable {

    private long id;
    private String firstName;
    private String lastName;
    private String adress;
    private String gemder;



}
